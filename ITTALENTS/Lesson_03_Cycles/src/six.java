import java.util.Scanner;


public class six {

	public static void main(String[] args) {
		System.out.println("Please enter one numbers and we will print the sum of all numbers between 1 and it.");
		Scanner test = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int a1 = test.nextInt();
		
		long sum=0;
	

		if (a1 >= 1) {
			for(int i=0;i<=a1;i++){
				sum +=i;
			}
			System.out.println("The sum is "+ sum);
			test.close();
			return;
		}
		
		if (a1 < 1) {
			for(int i=0;i>=a1;i--){
				sum +=i;
			}
			System.out.println("The sum is "+ sum);
			test.close();
			return;
		}
		test.close();

	}

}
