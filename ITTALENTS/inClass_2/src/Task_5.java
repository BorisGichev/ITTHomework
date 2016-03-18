
public class Task_5 {

	public static void main(String[] args) {
		int[][] arrN = {{ 4, 1, 3, 4, 0 },{ 4, 1, 3, 4, 10 },{ 4, 1, 3, 4, 10 },{ 400, 1, 3, 4, 0 }};

		int sum = 0;
		int tempSum= 0 ;
		int row=0;
		for (int i = 0; i < arrN.length; i++) {
			
			for (int j = 0; j < arrN[i].length; j++) {
				
				tempSum +=arrN[i][j];
			}
			
			if (tempSum>sum) {
				sum=tempSum;
				row=i;
				
			}
			tempSum=0;
		}
		
		
		System.out.println("The max sum is "+sum+" and it is on row "+(row+1));
		
	}

}
