public class twentyThree {

	public static void main(String[] args) {
		int i=1;
		int j=1;
		
		while(i<=9){
			
			while(j<=9){
				if(i<=j){
					System.out.print(i+"*"+j+"="+i*j+"; ");	
				}
				
				j++;
			}
			j=1;
			System.out.println();
			i++;
		}

	}
}
