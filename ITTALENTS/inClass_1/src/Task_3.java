import java.util.Scanner;


public class Task_3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 
		System.out.println("Please enter the first number");
		int A = read.nextInt();
		System.out.println("Please enter the first number");
		int B = read.nextInt();
		
		if(A>B){
			for(;B<=A;B++){
				if(B%3==0){
				System.out.print(B+" ");	
				}
				
			}
			
		}
		
		if(A<=B){
		for(;A<=B;A++){
			if(A%3==0){
			System.out.print(A+" ");	
			}
			
		}
		
	}

		read.close();
	}

}
