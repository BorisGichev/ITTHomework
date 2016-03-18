public class Task_10 {

	public static void main(String[] args) {
		int[] a = {4, 1, 2, 3, 1, 2, 3, 4, 1, 4, 4,1,1,1,1};
		int max = 0;
		int maxElement = 0;
		int count = 1;
		
		for (int index=0; index<a.length-1; index++) {
			count = 1;
			
			for (int index2=index+1; index2 < a.length; index2++) {
				if (a[index2] == a[index]) {
					count++;
				}
			}
			
			if (count > max) {
				max = count;
				maxElement = a[index];
			}
		}
		
		System.out.println("Max element is : " + maxElement + "(" + max + " times)");
		
		

	}

}
