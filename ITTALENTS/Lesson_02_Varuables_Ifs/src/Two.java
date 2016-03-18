import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out
				.println("Please enter two numbers and we will make some calculations with them.");
		Scanner test = new Scanner(System.in);

		System.out.println("Please enter X:");
		double a = test.nextDouble();
		System.out.println("Please enter Y:");
		double b = test.nextDouble();

		// I tried to fix the wrong results from using double numbers by
		// rounding
		double sum = a + b;
		double rSum = Math.round(sum * 10000000.0) / 10000000.0;
		double sub = a - b;
		double rSub = Math.round(sub * 10000000.0) / 10000000.0;
		double subRev = b - a;
		double rSubRev = Math.round(subRev * 10000000.0) / 10000000.0;
		double mul = a * b;
		double rMul = Math.round(mul * 10000000.0) / 10000000.0;
		double div = a / b;
		double rDiv = Math.round(div * 10000000.0) / 10000000.0;
		double divRev = b / a;
		double rDivRev = Math.round(divRev * 10000000.0) / 10000000.0;
		double lef = a % b;
		double rLef = Math.round(lef * 10000000.0) / 10000000.0;
		System.out.println("The sum of the numbers is: " + rSum);
		System.out.println("The result from X-Y is: " + rSub);
		System.out.println("The result from X-Y is: " + rSubRev);
		System.out.println("The multiplication of the numbers is: " + rMul);
		System.out.println("The division X/Y: " + rDiv);
		System.out.println("The division X/Y: " + rDivRev);
		System.out.println("The leftover from the division of the numbers is: " + rLef);
		test.close();

	}
}
