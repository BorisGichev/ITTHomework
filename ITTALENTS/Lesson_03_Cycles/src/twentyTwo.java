import java.util.Scanner;


public class twentyTwo {

	public static void main(String[] args) {
		System.out.println("Please enter one number in the range[1;999] ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		double a1 = sc.nextDouble();

		if ((a1 > 999) || (a1 < 1)) {
			System.out.print("Input out of range");
			sc.close();
			return;
		}
		int i=1;
		int j=1;
		
		while(j<=10){
			if((i>a1)&&((i%2==0)||(i%3==0)||(i%5==0))){
				System.out.print(j+":"+i+", ");
				j++;
			}
			i++;
		}
		sc.close();

	}

}
