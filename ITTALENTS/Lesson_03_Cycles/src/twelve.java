
public class twelve {

	public static void main(String[] args) {
		
		for(int i=100;i<=999;i++){
			
			int a=i%10;
			int b=((i/10)%10);
			int c=((i/100)%10);
			if((a!=b)&&(a!=c)&&(b!=c))
			System.out.print(i+", ");
		}

	}

}
