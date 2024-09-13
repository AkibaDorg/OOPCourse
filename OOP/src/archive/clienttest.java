package archive;

public class clienttest {

	public static void main(String[] args) {
		CD banger1 = new CD("10029195", "Fat of the land",  "Electronic", "The Prodigy");
		CD banger2 = new CD("292019258", "Nanimono", "Japanese Rock", "Polkadot Stringray");
		CD doppelganger = banger1;
		
		Video something = new Video("21094210", "Faust", 240);
		Video somethingtoo = new Video("1239049", "Hamlet", 250);
		Video auchdoppelganger = something;
		
		
		// Displays everything available
		System.out.println("----- CDs -----");
		banger1.displayInfo();
		System.out.println();
		banger2.displayInfo();
		System.out.println();
		doppelganger.displayInfo();
		System.out.println();
		
		System.out.println("----- Videos -----");
		something.displayInfo();
		System.out.println();
		somethingtoo.displayInfo();
		System.out.println();
		auchdoppelganger.displayInfo();
		System.out.println();
		
		
		
		// Testing if equals method works
		System.out.println("Testing CD equals method");
		if(banger1.equals(doppelganger)) {
			System.out.println("Doppelgänger detected!");
		}
		if(banger1.equals(banger2)) {
			System.out.println("Something wrong happened...");
		}
		
		System.out.println("Testing Video equals method");
		if(something.equals(auchdoppelganger)) {
			System.out.println("Doppelgänger detected again!");
		}
		if(something.equals(somethingtoo)) {
			System.out.println("Something bad happened...");
		}
		

	}

}
