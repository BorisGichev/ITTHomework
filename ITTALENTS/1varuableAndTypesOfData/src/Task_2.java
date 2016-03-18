import java.util.Scanner;


public class Task_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter X");
		int x = sc.nextInt();
		System.out.println("Please enter Y");
		int y = sc.nextInt();
		System.out.println("Please enter Z");
		int z = sc.nextInt();
		
		System.out.println("All"+x+y+z);
		x=x+y;
		y=x-y;
		x=x-y;
		
		y=y+z;
		z=y-z;
		y=y-z;
		
		System.out.println("All"+x+y+z);
		sc.close();
	}
}
