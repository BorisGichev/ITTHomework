import java.util.Arrays;


public class Task_6_1 {

	public static void main(String[] args) {
		int[] arr={10,22,43,64,21};
		
		for (int i = 4; i >=0; i--) {
			if (arr[i]>21) {
				arr[i]=(arr[i]+1)%(i+1);
				i++;
				
			}else{
				arr[i]=arr[i]*2;
				i--;
				
			}
			if (i>=0) {
				System.out.print(arr[i]+" ");
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
