import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a three digit number");
		int num = sc.nextInt();
		int numTemp=num;
		
		
		
		for(;num>0;){
			
			if((numTemp%(num%10))!=0){
				
				System.out.println("NE SE DELI");
				sc.close();
				return;
				
			}
			
			num/=10;
		}
		System.out.println("Deli se");
		sc.close();
	
	}
}
