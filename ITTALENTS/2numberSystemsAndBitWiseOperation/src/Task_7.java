
public class Task_7 {

	public static void main(String[] args) {
		int x = 15;

		int y = 10;
		
		

		int z = 0;

		z=x^y;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(Integer.toBinaryString(z));
		
		System.out.println(z);
	
		int count=0;

		while(z>0){
			if(z%2!=0){
				System.out.print(count);
				
			}
			
			z/=2;
			count++;
			
		}
		

	}

}
