import java.util.Arrays;


public class Task_12 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(makeArr(0)));
	}

	static int[] makeArr(int length) {
		
		int[] array = new int[length];
		
		for (int i = 0,num=1; i < array.length; i++) {
			array[i]=num;
			num++;
		}
		return array;
	}

}
