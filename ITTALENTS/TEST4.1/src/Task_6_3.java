
public class Task_6_3 {
public static void main(String[] args) {
		
		int num = 25;
		isCube(num);
		
		}

static void isCube(int num){
	for (int i = 1; i <=num; i++) {

		if(i*i*i==num){
			System.out.println(num+" is a cube of "+i);
			return;
		}
	}
	
	System.out.println(num+" is not a cube");
}
}
