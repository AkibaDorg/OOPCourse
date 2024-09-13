package bank;
import java.util.Scanner;
public class bank {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		
		Scanner input = new Scanner(System.in);
		Bankaccount accounts[] = new Bankaccount[100];
		int size = 0;
		
		double interest = 0.0125;
		
		// menu logic
		boolean hasQuit = false;
		char option;
		while(!hasQuit) {
			System.out.println("Please select an option\n(O)pen an account\n(C)heck account\n(D)eposit money\n(W)ithdraw money\n(T)ransfer money\n(U)pdate interest\n(V)iew total accounts\n(Q)uit\n");
			String text = input.next();
			text = text.toLowerCase();
			option = text.charAt(0);
			
			switch(option) {
			// open account
			case 'o':
				System.out.println("Please enter name");
				String name = input.next();
				
				System.out.println("Please enter ID");
				String id = input.next();
				
				System.out.println("Please enter initial deposit");
				double deposit = input.nextDouble();
				
				accounts[size] = new Bankaccount(name, id, deposit);
				size++;
				
				System.out.println("Account creation complete!\n");
				break;
			
			// check account
			case 'c':
				System.out.println("Enter ID of account to check");
				id = input.next();
				int location = findAccount(accounts, id);
				if(location == -1) {
					System.out.println("ERROR! Invalid ID. Please try again.");
				}
				else {
					System.out.println(accounts[location].getInfo());
				}
				break;
			
			// deposit money
			case 'd':
				System.out.println("Enter ID of account to deposit");
				id = input.next();
				location = findAccount(accounts, id);
				if(location == -1) {
					System.out.println("ERROR! Invalid ID. Please try again.");
				}
				else {
					System.out.println("Enter amount to deposit");
					deposit = 0;
					accounts[location].deposit(deposit);
				}
				System.out.println("Deposit complete!\n");
				break;
				
			// withdraw money
			case 'w':
				System.out.println("Enter ID of account to withdraw");
				id = input.next();
				location = findAccount(accounts, id);
				if(location == -1) {
					System.out.println("ERROR! Invalid ID. Please try again.");
				}
				else {
					System.out.println("Enter amount to withdraw");
					double withdraw = 0;
					accounts[location].deposit(withdraw);
				}
				
				System.out.println("Deposit complete!\n");
				break;
				
			// transfer money
			case 't':
				System.out.println("Enter Transferer's account");
				id = input.next();
				int transfer = findAccount(accounts, id);
				if(transfer == -1) {
					System.out.println("ERROR! Invalid ID. Please try again.");
					break;
				}
				
				System.out.println("Now, enter transferee's account");
				id = input.next();
				int transferee = findAccount(accounts, id);
				if(transferee == -1) {
					System.out.println("ERROR! Invalid ID. Please try again.");
					break;
				}
				
				System.out.println("How much money will be transfered?");
				double transferamt = input.nextDouble();
				
				accounts[transfer].withdraw(transferamt);
				accounts[transferee].deposit(transferamt);
				
				System.out.println("Transfer complete!\n");
				
				break;
				
			// update interest
			case 'u':
				System.out.println("Please enter new interest percentage\nUse decimal. For example, 0.025 is 2.5%");
				interest = input.nextDouble();
				break;
				
			// view all accounts
			case 'v':
				System.out.println("Total amount of accounts: " + size);
				
				if(size == 0) {
					System.out.println("ERROR! No accounts!");
					break;
				}
				
				double totalbal = 0;
				
				for(int x = 0; x < size; x++) {
					totalbal += accounts[x].getBal();
				}
				
				System.out.println("\n\nTotal balance of all accounts is: " + totalbal);
				System.out.println("The interest rate is currently at: " + interest * 100 + "%\n");
				break;
				
			// quit
			case 'q':
				System.out.println("Thank you for using Ponzi Bank. Goodbye!");
				hasQuit = !hasQuit;
				input.close();
				break;
				
			default:
				System.out.println("ERROR! Invalid option. Try again.");
				break;
			}
			
		}

	}
	
	public static int findAccount(Bankaccount[] accounts, String id) {
		
		int spot = 0;
		for (Bankaccount account : accounts) {
			if(account.getID().equals(id)) {
				
				return spot;
			}
			else {
				spot++;
			}
		}
		return -1;
	}
}
