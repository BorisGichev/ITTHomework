import java.util.Scanner;


public class Task_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a boolean");
		boolean x=sc.nextBoolean();
		
		System.out.println("Enter a boolean");
		boolean y=sc.nextBoolean();
		
		System.out.println("X & Y = "+(x&y));
		System.out.println("X | Y = "+(x|y));
		System.out.println("X ^ Y = "+(x^y));
		sc.close();
	}

}
