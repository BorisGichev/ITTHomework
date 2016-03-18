import java.util.Scanner;


public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a  number");
		long num=sc.nextLong();
		
		do{

			System.out.print(num%10);
			num /=10;
				
		} while (num>0);
		sc.close();

	}

}
