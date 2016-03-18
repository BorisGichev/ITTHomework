
public class Task_14 {

	public static void main(String[] args) {
		System.out.println(fac(10));

	}

	static int fac(int num){
		
		
		if(num==0){
			return 0;
		}
		if(num==1){
			return 1;
		}
//		How is it best to return nothing ?
		if (num<0) {
			System.out.println("Please enter a positive number");
			return 0;

		}
		
		return num*fac(num-1);
		
		
	}
}
