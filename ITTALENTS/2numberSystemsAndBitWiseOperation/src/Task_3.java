import java.util.Scanner;


public class Task_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		int x = sc.nextInt();
		System.out.println("Please enter a number");
		int y = sc.nextInt();
		
		int z=x-y;
		int i=z>>31&1;
		
		int max=x-i*(x-y);
		
		System.out.println(max);
		
		sc.close();
		

	}

}
