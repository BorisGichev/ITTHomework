import java.util.Scanner;


public class Task_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number X");
		long x = sc.nextLong();
		
		
		System.out.println("Please enter number Y");
		long y = sc.nextLong();
		
		long xFac=1;
		long yFac=1;
		
		for (int i = 1; i <=x; i++) {
			xFac*=i;
			
		}
		
		for (int i = 1; i <=y; i++) {
			yFac*=i;
			
		}
		System.out.println(xFac);
		System.out.println(yFac);
		System.out.println(xFac+yFac);
		sc.close();
	}

}
