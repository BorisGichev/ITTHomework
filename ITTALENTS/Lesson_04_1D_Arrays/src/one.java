import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out
				.println("Please enter an array of whole numbers, but for doing that first tell me how long do you want it to be?");
		int l = sc.nextInt();
		
		if(l<=0){
			System.out.println("Invalid input, please enter a whole positive number!!!");
			sc.close();
			return;
		}

		int[] arr = new int[l];
		System.out.println("Now let us start entering the array.");

		for (int i = 0; i < l; i++) {
			arr[i] = sc.nextInt();

		}
		
		int  minThree= Integer.MAX_VALUE;
		boolean flag=false;
		for (int m = 0; m < l; m++) {
			if((arr[m]%3==0)&&(arr[m]<minThree)){
				minThree=arr[m];
				flag=true;
			}

		}
		
		if((minThree==Integer.MAX_VALUE)&&(flag==false)){
			System.out.println("Sorry in the entered array there are no numbers that can be divided by three with no leftover.");
		}
		else{
			System.out.println("The smallest number in the array that can be divided by three is : "+minThree);
		}
		sc.close();
	}

}
