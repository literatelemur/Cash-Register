import java.util.Scanner; 

public class CashRegister {
	
	public static void main(String[] args) {
		Scanner quantity = new Scanner(System.in);
		
		int coin;
		int bill;
		double coinTotal;
		double billTotal;
		
		System.out.println("Enter the quantity of:");
		System.out.println("Pennies:");
		coin = quantity.nextInt();
		coinTotal = coin * .01;
		System.out.println("Nickels:");
		coin = quantity.nextInt();
		coinTotal = coinTotal + coin * .05;
		System.out.println("Dimes:");
		coin = quantity.nextInt();
		coinTotal = coinTotal + coin * .1;
		System.out.println("Quarters:");
		coin = quantity.nextInt();
		coinTotal = coinTotal + coin * .25;
		
		System.out.println("$1 Bills:");
		bill = quantity.nextInt();
		billTotal = bill * 1;
		System.out.println("$5 Bills:");
		bill = quantity.nextInt();
		billTotal = billTotal + bill * 5;
		System.out.println("$10 Bills:");
		bill = quantity.nextInt();
		billTotal = billTotal + bill * 10;
		System.out.println("$20 Bills:");
		bill = quantity.nextInt();
		billTotal = billTotal + bill * 20;
		
		System.out.println("Total in coins: $" + coinTotal);
		System.out.println("Total in bills: $" + billTotal);
		System.out.println("Grand total: $" + (coinTotal + billTotal));
		
		
	}

}