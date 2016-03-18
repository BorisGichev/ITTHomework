import java.util.Scanner;

public class twentyOne {

	public static void main(String[] args) {
		System.out.println("Please enter one number in the range[1;51] ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number:");
		double a1 = sc.nextDouble();

		if ((a1 > 51) || (a1 < 1)) {
			System.out.print("Input out of range");
			sc.close();
			return;
		}
		for(;a1<=52;a1++){
			
			if ((a1/4>0)&&(a1/4<=1)){
				System.out.print("two");
			}
			if ((a1/4>1)&&(a1/4<=2)){
				System.out.print("three");
			}
			if ((a1/4>2)&&(a1/4<=3)){
				System.out.print("four");
			}
			if ((a1/4>3)&&(a1/4<=4)){
				System.out.print("five");
			}
			if ((a1/4>4)&&(a1/4<=5)){
				System.out.print("six");
			}
			if ((a1/4>5)&&(a1/4<=6)){
				System.out.print("seven");
			}
			if ((a1/4>6)&&(a1/4<=7)){
				System.out.print("eight");
			}
			if ((a1/4>7)&&(a1/4<=8)){
				System.out.print("nine");
			}
			if ((a1/4>8)&&(a1/4<=9)){
				System.out.print("ten");
			}
			if ((a1/4>9)&&(a1/4<=10)){
				System.out.print("Jack");
			}
			if ((a1/4>10)&&(a1/4<=11)){
				System.out.print("Queen");
			}
			if ((a1/4>11)&&(a1/4<=12)){
				System.out.print("King");
			}
			if ((a1/4>12)&&(a1/4<=13)){
				System.out.print("Ace");
			}

			
			if(a1%4==0){
				System.out.print(" of spades, ");
			}
			if(a1%4==3){
				System.out.print(" of hearts, ");
			}
			if(a1%4==2){
				System.out.print(" of diamonds, ");
			}
			if(a1%4==1){
				System.out.print(" of clubs, ");
			}
		}
		sc.close();

	}

}
