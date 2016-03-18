public class Task_5 {

	public static void main(String[] args) {
		int[] arr = { 9, 13, 2, 7, 3, 8, 12, 4, 5, 2, 16 };
		double avverage = 0;
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avverage=sum/arr.length;
		
		int closest=0;
		
		double diff=Double.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			double diffTemp = avverage-Math.sqrt(arr[i]*arr[i]);
			diffTemp=Math.sqrt(diffTemp*diffTemp);
			
			if(diffTemp<=diff){
				closest=arr[i];
				diff=diffTemp;
			}
		}
		System.out.println("The avverage is "+avverage);
		System.out.println(closest);
	}

}
