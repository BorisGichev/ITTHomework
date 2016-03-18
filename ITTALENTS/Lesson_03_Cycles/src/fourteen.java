import java.util.Scanner;


public class fourteen {

	public static void main(String[] args) {
		Scanner test = new Scanner(System.in);
		System.out.println("Please enter number in the range [10;200]");
		int a1 = test.nextInt();
		
		if ((a1>200)||(a1<10)){
			System.out.print("Input out of range");
			test.close();
			return;
		}
		for (; 10 <= a1; a1--) {

			
			if (a1%7== 0){
				System.out.print(a1 + ", ");
			}
				
		}
		test.close();


	}

}
