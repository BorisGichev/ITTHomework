
public class Task_07 {

	public static void main(String[] args) {
		int x = 9;
		int y = 3;
//System.out.println(mul(x,y));
System.out.println(power(x,y));
	}

	static int mul(int num, int by) {
		if (by == 1) {
			return num;

		}
		
		return num+mul(num,by-1);
	}
	
	static int power(int num, int by) {
		if (by == 2) {
			return mul(num,num);

		}
		
		return mul(num,power(num,by-1));
	}
}