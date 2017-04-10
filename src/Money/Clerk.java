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
		System.out.printf("The change due is $%.2f\n", (amountTendered - itemPrice));

		int changeDue = (int) ((amountTendered - itemPrice) * 100);
		System.out.println();

		String[] bill = { "Hundred", "Fifty", "Twenty", "Ten", "Five", "One", "Quarter", "Dime", "Nickel", "Penny" };
		String[] bills = { "Hundreds", "Fifties", "Twenties", "Tens", "Fives", "Ones", "Quarters", "Dimes", "Nickels",
				"Pennies" };

		int[] denomBreakdown = new int[10];
		denomBreakdown[0] = 10000; 	// this is for 100 dollars
		denomBreakdown[1] = 5000;
		denomBreakdown[2] = 2000;
		denomBreakdown[3] = 1000;
		denomBreakdown[4] = 500;
		denomBreakdown[5] = 100;
		denomBreakdown[6] = 25;
		denomBreakdown[7] = 10;
		denomBreakdown[8] = 5;
		denomBreakdown[9] = 1;		//this is for a penny

		for (int i = 0; i < denomBreakdown.length; i++) { // if plural
			if ((changeDue / denomBreakdown[i]) > 1) {
				System.out.println("The customer is owed: " + changeDue / denomBreakdown[i] + " " + bills[i]);
				changeDue = changeDue % denomBreakdown[i];
			}
			if ((changeDue / denomBreakdown[i]) == 1) { // if single
														// denomination
				System.out.println("The customer is owed: " + changeDue / denomBreakdown[i] + " " + bill[i]);
				changeDue = changeDue % denomBreakdown[i];
			}
		}

	}

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
