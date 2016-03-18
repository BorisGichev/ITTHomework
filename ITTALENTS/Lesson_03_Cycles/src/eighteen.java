import java.util.Scanner;


public class eighteen {

	public static void main(String[] args) {
		System.out.println("Please enter two numbers in the range[1;9] ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first one:");
		int a1 = sc.nextInt();
		System.out.println("Please enter the second one:");
		int a2 = sc.nextInt();

		if ((a1 > 9) || (a1 < 1) || (a2 > 10) || (a2 < 1)) {
			System.out.print("Input out of range");
			sc.close();
			return;
		}
		
		for(int i = 1;i<=a1;i++){
			for(int j =1;j<=a2;j++){
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		sc.close();

	}

}
