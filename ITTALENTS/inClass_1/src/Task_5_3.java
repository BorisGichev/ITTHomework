import java.util.Scanner;


public class Task_5_3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 
		System.out.println("Please enter a number and we will give you the binary code");
		
		int a = read.nextInt();
		
		long sum = 0;
		int bit = 0;
		int dec = 1;
		
		for(;a>0;){
			
			bit=a%2;
			a /=2;
			sum+=(bit*dec);
			dec*=10;
			
		}
		
		System.out.println(sum);
		read.close();

	

	}

}
