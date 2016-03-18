
public class Task_8 {

	public static void main(String[] args) {
		byte x = -10;

		int mark=(x&(1<<7))>>7;
		
		
		boolean test=(mark==1);
		
		System.out.println(test);

	}

}
