import java.util.Scanner;

public class Task_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter the length of the three sides of a triangle");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if ((a + b > c) && (a + c > b) && (b + c > a)) {

			double p = (a + b + c) / 2;
			
			double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			
			System.out.println("Area is " + area);
			int par = (int)(a+b+ c);
			System.out.println("Parameter is " + par);

		}
		else{
			System.out.println("Not possible triangle");
		}
		sc.close();
	}

}
