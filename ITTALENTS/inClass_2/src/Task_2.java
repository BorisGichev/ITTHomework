
public class Task_2 {

	public static void main(String[] args) {
		int[] arrN = { 1 ,9 , 1, 2  };
		boolean isEngy = true;
		
		for (int i = 1; i < arrN.length-1; i++) {
			if (!(((arrN[i]>arrN[i-1])&&(arrN[i]>arrN[i+1]))||((arrN[i]<arrN[i-1])&&(arrN[i]<arrN[i+1])))) {
				isEngy=false;
			}
		}

		if (isEngy==true) {
			System.out.println("Is edgy");
			
		}
		else{
			System.out.println("Not edgy");
		}
	}

}
