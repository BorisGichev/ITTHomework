import java.util.Scanner;


public class Task_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a four digit number");
		int num = sc.nextInt();
		
		int d =num%10;
		num/=10;
		int c =num%10;
		num/=10;
		int b =num%10;
		num/=10;
		int a =num%10;
		
		if(a==0||b==0||c==0||d==0){
			System.out.println("Contains ZERO");
		}
		else{
			System.out.println("NO ZEROS");
		}
		
		sc.close();

	}

}
