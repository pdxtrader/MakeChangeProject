package Money;

import java.util.Scanner;

public class Clerk {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		float itemPrice = 0.00F;
		float amountTendered = 0.00F;
		float[] giveMe = new float[2];

		giveMe = queryClerk(kb);
		itemPrice = giveMe[0];
		amountTendered = giveMe[1];
		
		
		float changeDue = (itemPrice - amountTendered);
		System.out.println(changeDue);
		
		// public class DoWhile {
		// int i = 1;
		// if (i < 1024) {
		// do { i*=2;
		// System.out.println("Count is: " + i);
		// } while (i < 1024);
	}// end main

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
			System.out.printf("The purchase price of $%.2f is greater than ", itemPrice);
			System.out.println();
			System.out.printf("the amount tendered of $%.2f, please correct\n", amountTendered);
			System.out.println("*****ERROR*****ERROR*****ERROR*****ERROR*****");
			System.out.println();
			arrayQuery = queryClerk(s);
			return arrayQuery;
		} else {
			return arrayQuery;
		}
	}// end clerk query method
}

// User Story #3
//
// Display an appropriate message if the customer provided too little money or
// the exact amount.
//
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
// // TODO Auto-generated method stub

// }
// }

//
// [2:27]
// System.out.printf("%.2f", change);
//
// [2:28]
// It prints out the double to two sig figs

// char first = '\u0042';
// char middle = '\u0053';
// char last = '\u0042';
//
// System.out.println("Intials: " + first + middle + last);
