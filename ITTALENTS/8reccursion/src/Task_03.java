
public class Task_03 {

	public static void main(String[] args) {
		int[] arr = { 1,2, 3, 4, 5, 6, 13, 8, 9,10, 16 };
		System.out.println(isIncr(arr, arr.length-1));
		System.out.println(isAscendingHelper(arr,arr.length-1));
	}

	private static boolean isAscendingHelper( int[] array, int index )
	{
	    if( index <= 0 )
	       return true;
	    else if( array[index] <= array[index-1] )
	       return false;
	    else
	       return isAscendingHelper( array, index - 1 );
	}
	
	
	static boolean isIncr(int[] arr,int num) {
		
		if (num == 1) {
			if (arr[0]<arr[1]) {
				return true;
			}
			else{
				return false;
			}

		}
		if (arr[num]<=arr[num-1]){
			return false;
		}
		
		else{
			return isIncr(arr,num-1);
		}
		
	}

}
