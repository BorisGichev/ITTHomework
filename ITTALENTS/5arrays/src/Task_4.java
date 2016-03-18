public class Task_4 {

	public static void main(String[] args) {
		int[] arr = { 3, 3, 2, 3, 3, 3,2, 1, 1, 1, 1 };

		int counter = 1;
		int counterTemp = 1;
		int number=0;
			
			
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] == arr[j - 1]) {
					counterTemp++;
					
				} 
				if (counterTemp>counter) {
					counter=counterTemp;
					number=arr[j];
					
				}
				if (!(arr[j] == arr[j - 1])) {
					counterTemp=1;
				} 
			}
			
			for (int i = 0; i < counter; i++) {
				System.out.print(number+" ");
			}
			
			
		
		
		

	}

}
