


public class Task_5 {

	public static void main(String[] args) {
		
		int x =0;
		
		int y = 2;
		
		int z =5;
		
		int num = 0;
		
		
		num = num | (1 << x);
		num = num | (1 << y);
		num = num | (1 << z);
		
		System.out.println(num);
		System.out.println(Integer.toBinaryString(num));
		
	}

}
