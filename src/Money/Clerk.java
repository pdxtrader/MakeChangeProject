package Money;

import java.util.Scanner;

public class Clerk {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		float itemPrice = 0.00F;
		float amountTendered = 0.00F;
		float[] giveMe = new float[2];

		//put logic here then it will bypass the loop and make float changeDue as a deprirotiziation
		
		giveMe = queryClerk(kb);
		itemPrice = giveMe[0];
		amountTendered = giveMe[1];
		
		float changeDue = (itemPrice - amountTendered);
		System.out.println();
		System.out.printf("The change due is $%.2f\n", changeDue);

		
		int[] denomBreakdown = new int[10];
		denomBreakdown[0] = 10000;			//this is for 100 dollars
		denomBreakdown[1] = 5000;
		denomBreakdown[2] = 2000;
		denomBreakdown[3] = 1000;
		denomBreakdown[4] = 500;
		denomBreakdown[5] = 100;
		denomBreakdown[6] = 25;
		denomBreakdown[7] = 10;
		denomBreakdown[8] = 5;
		denomBreakdown[9] = 1;				//this is for 1 cent
		
		int[] coinCounter = new int[10];  //how many of each denomination for clerk to return
		
			do { 
					switch (coinCounter[0]) {
						case 1:  //100 dollar bills
							if (changeDue > 100) {
								++coinCounter[0];
			        }
			        else coinCounter[0] = 0;
			        break;
//				}
			}
			}
			while ( changeDue > 0 );
		
			System.out.println("post adder" + changeDue);
			System.out.println("pos 1 coinCt : " + coinCounter [0]);
			
			
//		for (; changeDue != 0 ; c++) {
//			
//		}
		
		
		
		
		
//		for (c = 0; c < 200; c++) {
//		}
//		}
//		static float fib(int num) {
//			int fibNum = -1;
//			if 		(num == 0) { fibNum = 0; }
//			else if (num == 1) { fibNum = 1; }
//			else 	{ fibNum = fib(num-1) + fib(num-2); }
//			return fibNum;
//		}
	
		
//		//call this into a method, need to bring in changeDue somehow
//		if (changeDue != remainingChange) {
//			do { 
//				
//				
//			}
//		}

		// void loop(int i, int j, int k) {
		// list.add(array[i] + array[j] + array[k]);
		//
		// // advance states
		// k++;
		// if (k == x) { k = 0; j++; }
		// if (j == x) { j = 0; i++; }
		// if (i == x) { i = 0; }
		//
		// // terminate on all wrap-around
		// if (i == 0 && j == 0 && k == 0) { return; }
		//
		// // recurse
		// loop(i, j, k);
		
		// public class DoWhile {
		// int i = 1;
		// if (i < 1024) {
		// do { i*=2;
		// System.out.println("Count is: " + i);
		// } while (i < 1024);
	}// end main

	// public static void typeChangeReturn (float changeDue) {
	// int i = 1;
	// while (i < 1024) {
	// i *= 2;
	// System.out.println("Count is: " + i);
	// }

	public static float[] queryClerk(Scanner s) {
		System.out.println("Enter the price of the product to be purchased: ");
		float itemPrice = s.nextFloat();

		System.out.println("Enter the amount of cash the customer tendered: ");
		float amountTendered = s.nextFloat();

		float[] arrayQuery = new float[2];
		arrayQuery[0] = itemPrice;
		arrayQuery[1] = amountTendered;

		if (itemPrice > amountTendered) {
			System.out.println();
			System.out.println("*****ERROR*****ERROR*****ERROR*****ERROR*****");
			System.out.println();
			System.out.printf("The purchase price of $%.2f is greater than ", itemPrice);
			System.out.println();
			System.out.printf("the amount tendered of $%.2f, please correct\n", amountTendered);
			System.out.println();
			System.out.println("*****ERROR*****ERROR*****ERROR*****ERROR*****");
			System.out.println();
			arrayQuery = queryClerk(s);
			return arrayQuery;
		} else {
			return arrayQuery;
		}
	}// end clerk query method
}

// User Story #4
//
// If the amount tendered is more than the cost of the item, display the number
// of bills and coins that should be given to the customer.

// public class For {
// public static void main(String[] args){
// for(int i=2; i<=1024; i *= 2){
// System.out.println("Count is: " + i);
// }
// }
//
//
//
//
// public class While {
// public static void main(String[] args){
// int i = 1;
// while (i < 1024) {
// i *= 2;
// System.out.println("Count is: " + i);
// }
// }
//
//
// public class DoWhile {
// public static void main(String[] args){
// int i = 1;
// if (i < 1024) {
// do { i*=2;
// System.out.println("Count is: " + i);
// } while (i < 1024);
// }
// }
//
// void loop(int i, int j, int k) {
// list.add(array[i] + array[j] + array[k]);
//
// // advance states
// k++;
// if (k == x) { k = 0; j++; }
// if (j == x) { j = 0; i++; }
// if (i == x) { i = 0; }
//
// // terminate on all wrap-around
// if (i == 0 && j == 0 && k == 0) { return; }
//
// // recurse
// loop(i, j, k);
// }

//
// System.out.println(itemPrice);
// System.out.println(amountTendered);
//
// }
//
// private static void queryClerk(float itemPrice, int amountTendered) {

// char first = '\u0042';
// char middle = '\u0053';
// char last = '\u0042';
//
// System.out.println("Intials: " + first + middle + last);

//// breakdown method, maybe make this into an array
// make a note to clerk that we don't take denoms higher
//// than that
