import java.util.Scanner;

public class Task_7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out
				.println("Please enter a number and we will give you the binary code");
		short num = read.nextShort();

		System.out.println("Please enter position 1");
		short pos1 = read.nextShort();
		
		System.out.println("Please enter position 2");
		short pos2 = read.nextShort();
		
		System.out.println(toByte(num));
		
		
		
		short rev1=(short) (1<<pos1-1);
		short rev2=(short) (1<<pos2-1);
		
		System.out.println(toByte(rev1));
		System.out.println(toByte(rev2));
		
		num=(short) (num^rev1);
		num=(short) (num^rev2);
		
		System.out.println(toByte(num));
		System.out.println(num);

		
		read.close();

	}
static short toByte(short num){
	short sum = 0;
	short bit = 0;
	short dec = 1;
	for (; num > 0;) {

		bit = (short) (num % 2);
		
		num /= 2;
		sum += (bit * dec);
		dec *= 10;
		

	}
	return sum;
	
}
}
