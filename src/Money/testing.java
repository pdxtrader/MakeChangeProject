package Money;

public class testing {
	public static void main (String[] args) {
	// MakeChange.java - change in dimes and pennies

	    int price, change, dimes, pennies;
	    System.out.println("type price (0:100):");
	    price = 90; 
	    change = 100 - price;      //how much change
	    dimes = change / 10;       //number of dimes
	    pennies = change % 10;     //number of pennies
	    System.out.print("The change is :");
	    System.out.print(dimes);
	    System.out.print(" dimes ");
	    System.out.print(pennies);
	    System.out.print(" pennies.\n");
	  }
	}
	
