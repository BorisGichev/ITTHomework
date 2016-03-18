import java.util.Scanner;

public class nineteen {

	public static void main(String[] args) {
		System.out.println("Please enter one number in the range[10;99] ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int a1 = sc.nextInt();

		if ((a1 > 99) || (a1 < 10)) {
			System.out.print("Input out of range");
			sc.close();
			return;
		}
		for (; a1 != 1;) {
			if(a1%2==0){
				a1 -= (a1/2);
				System.out.print(a1+", ");
				continue;
			}
			
			if(a1%2!=0){
				a1 = ((a1*3)+1);
				System.out.print(a1+", ");
				continue;
			}
		}
		sc.close();
	}

}
