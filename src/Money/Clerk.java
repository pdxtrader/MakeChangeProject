package Money;
import java.util.Scanner;

public class Clerk {
	public static void main(String[] args) {
		
		float itemPrice = 0.00F;
		int amountTendered = 0;
		
		
		
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the price of the product to be purchased: " );
		    itemPrice = kb.nextFloat();
		    
		System.out.println("Enter the amount of cash the customer tendered: " );
		    amountTendered = kb.nextInt();
		
		    
		    public class For {
		     public static void main(String[] args){
		              for(int i=2; i<=1024; i *= 2){
		               System.out.println("Count is: " + i);
		          }
		     }




		    public class While {
		        public static void main(String[] args){
		            int i = 1;
		            while (i < 1024) {
		                i *= 2;
		                System.out.println("Count is: " + i);
		          }
		     }


		    public class DoWhile {
		         public static void main(String[] args){
		            int i = 1;
		            if (i < 1024) {
		                do { i*=2;
		                    System.out.println("Count is: " + i);
		                } while (i < 1024);
		            }
		         }
		
		    void loop(int i, int j, int k) {        
		        list.add(array[i] + array[j] + array[k]);

		        // advance states
		        k++;
		        if (k == x) { k = 0; j++; }
		        if (j == x) { j = 0; i++; }
		        if (i == x) { i = 0; }

		        // terminate on all wrap-around
		        if (i == 0 && j == 0 && k == 0) { return; }

		        // recurse
		        loop(i, j, k);
		    }
		    
		    

		System.out.println(itemPrice);
		System.out.println(amountTendered);

	}
}

//The user is then prompted asking how much money was tendered by the customer.
//
//User Story #3
//
//Display an appropriate message if the customer provided too little money or the exact amount.
//
//User Story #4
//
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.

//
//[2:27]  
//System.out.printf("%.2f", change);
//
//[2:28]  
//It prints out the double to two sig figs

//char first = '\u0042';
//char middle = '\u0053';
//char last = '\u0042';
//
//System.out.println("Intials: " + first + middle + last);
