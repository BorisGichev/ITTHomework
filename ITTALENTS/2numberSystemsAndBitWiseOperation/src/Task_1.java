
public class Task_1 {

	public static void main(String[] args) {
		int a =6;
		
		System.out.println(Integer.toBinaryString(a));
		
		int b=(a&(1<<2));
		
		System.out.println(b);
		
		System.out.println(Integer.toBinaryString(b));

	}

}
