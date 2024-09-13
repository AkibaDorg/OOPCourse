package bank;

public class Bankaccount {
	private String name;
	private String id;
	private double balance;
	private static double interestrate;
	
	
	public Bankaccount(String n, String i, double b) {
		this.name = n;
		this.id = i;
		this.balance = b;
		
	}
	
	public String getID() {
		return id;
	}
	
	public String getInfo() {
		String info = this.id + "\n" + this.name + "\n" + this.balance;
		return info;
		
	}
	
	public double getBal() {
		return balance;
	}
	
	public static double getInterestRate() {
		return interestrate;
	}
	
	
	// TODO: fill out more
	public static void setInterestRate(double rate) {
		interestrate = rate;
		
	}
	
	public void withdraw(double amnt) {
		if(amnt > this.balance) {
			System.out.println("ERROR! Balance is too low for amount");
		}
		else {
			this.balance -= amnt;
		}
	}
	
	public void deposit(double amnt) {
		this.balance += amnt;
		
	}
	
	
	
	
	
}
