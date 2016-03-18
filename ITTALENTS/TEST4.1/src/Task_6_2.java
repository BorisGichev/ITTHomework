
public class Task_6_2 {

	public static void main(String[] args) {
		
		int counter=0;
		int balance=10;
		while(balance>=1){
			System.out.println(counter);
			counter++;
			if (balance<9) {
				continue;
				
			}
			balance=balance-9;
		}

	}

}
