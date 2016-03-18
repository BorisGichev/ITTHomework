
public class Task_5_2 {

	public static void main(String[] args) {
		int A = 123456789;
		int Rev = 0;
		
		for(;A>0;){
			Rev=Rev*10;
			Rev=Rev+A%10;
			A=A/10;
		}
		
		System.out.println(Rev);
			
				
	

	}

}
