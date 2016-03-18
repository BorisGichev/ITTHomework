
public class Task_01 {

	public static void main(String[] args) {
		int num=5;
		System.out.println(fac(num));

	}
	static int fac(int num){
		
		if (num==1) {
			return 1;
			
		}
		
		return num*fac(num-1);
	}

}
