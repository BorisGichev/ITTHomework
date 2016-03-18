import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		System.out
				.println("Please answer two questions and I will tell you what would I do, based on your answers.");
		Scanner sc = new Scanner(System.in);

		System.out
				.println("Please enter amount of money I have (positive number or zero).");
		double money = sc.nextDouble();
		System.out.println("Please enter `true` or `false`.I am healthy?  ");
		boolean con = sc.nextBoolean();

		if (money < 0) {
			System.out.println("Please enter a positive number or zero for the amount of money");
			sc.close();
			return;
		}

		if (con == false) {

			if (money > 0) {
				System.out.print("I will buy some medicine from the primacy and stay home after that.");
			}

			if (money == 0) {
				System.out
						.print("I will stay home and I will drink some tea. ");
			}

		}

		if (con == true) {
			if (money >= 10) {
				System.out.print("I will go to the movies with friends.");
			}
			if ((money < 10) && (money > 0)) {
				System.out.print("I will go to drink a cup of coffee.");
			}
			if (money == 0) {
				System.out.print("I am healthy but I have no money for coffee");
			}
		}

		sc.close();
	}

}
