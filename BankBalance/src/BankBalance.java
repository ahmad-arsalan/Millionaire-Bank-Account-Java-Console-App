/**
 * @author Ahmad Arsalan
 * Project Name: Bank Balance
 */
import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {
		System.out.println("Welcome to The First National Bank of Parkville, we can see you are interested \n"
				+ "in opening a \"So you want to be a Millionaire\" savings account. \n"
				+ "\n"
				+ "This account works as follows: \n"
				+ "\n"
				+ '\u2022' + "The bank doubles the customer's balance every year until the customer's\n"
				+ " balance reaches one million. \n"
				+ "\n"
				+ '\u2022' + "The customer isn't allowed to touch the money (no deposits or withdrawals) until\n"
				+ " the customer's balance reaches one million. If the customer dies before becoming\n"
				+ " a millionaire, the bank keeps the customer's balance.\n"
				+ "\n"
				+ "If you have read the above disclaimer and would like to proceed, please enter your\n"
				+ "starting balance below. We will tell you how many years it will take for\n"
				+ "your starting balance to reach $100,000 and $1,000,000.\n"
				+ "\n");
		try (Scanner in = new Scanner(System.in)){
			int startingBalance;
		System.out.print("Enter your starting balance: ");
		startingBalance = in.nextInt();
		System.out.println("It takes " + (int)Math.ceil(Math.log(100000/startingBalance)/Math.log(2)) + " years to reach $100,000. ");
		System.out.println("It takes " + (int)Math.ceil(Math.log(1000000/startingBalance)/Math.log(2)) + " years to reach $1,000,000. ");
		}
	}
}