public class Task_6 {

	public static void main(String[] args) {
		int x = 10;

		int y = 2;

		int z = 1;

		
		System.out.println(Integer.toBinaryString(x));
		x = x^(1 << y);
		x = x^(1 << z);

		
		System.out.println(x);
		System.out.println(Integer.toBinaryString(x));

	}

}
