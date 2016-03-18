import java.util.Scanner;


public class Task_6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 
		System.out.println("Please enter a number and we will give you the binary code");
		
		short a = read.nextShort();
		long sum = 0;
		int bit = 0;
		int dec = 1;
		int countOnes=0;
		for(;a>0;){
			
			bit=a%2;
			if(bit==1){
			countOnes++;	
			}
			a /=2;
			sum+=(bit*dec);
			dec*=10;
			
			
		}
		
		System.out.println(sum);
		System.out.println(countOnes);
		read.close();
	}

}
