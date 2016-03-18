public class Task_10 {

	public static void main(String[] args) {
		byte x = 9;

		byte y = 8;

		byte z = 16;

		int firstOfX = x & (1 << 0);
		int firstOfY = y & (1 << 0);
		int firstOfZ = z & (1 << 0);
		int firstOfresult = (firstOfX & firstOfY) & (firstOfZ ^ 1);

		int secondOfX = (x & (1 << 1)) >> 1;
		int secondOfY = (y & (1 << 1)) >> 1;
		int secondOfZ = (z & (1 << 1)) >> 1;
		int secondOfresult = (secondOfX & secondOfY) & (secondOfZ ^ 1);

		int thirdOfX = (x & (1 << 2)) >> 2;
		int thirdOfY = (y & (1 << 2)) >> 2;
		int thirdOfZ = (z & (1 << 2)) >> 2;
		int thirdOfresult = (thirdOfX & thirdOfY) & (thirdOfZ ^ 1);
		
		int fourthOfX = (x & (1 << 3)) >> 3;
		int fourthOfY = (y & (1 << 3)) >> 3;
		int fourthOfZ = (z & (1 << 3)) >> 3;
		int fourthOfresult = (fourthOfX & fourthOfY) & (fourthOfZ ^ 1);
		
		int fifthOfX = (x & (1 << 4)) >> 4;
		int fifthOfY = (y & (1 << 4)) >> 4;
		int fifthOfZ = (z & (1 << 4)) >> 4;
		int fifthOfresult = (fifthOfX & fifthOfY) & (fifthOfZ ^ 1);
		
		int sixthOfX = (x & (1 << 5)) >> 5;
		int sixthOfY = (y & (1 << 5)) >> 5;
		int sixthOfZ = (z & (1 << 5)) >> 5;
		int sixthOfresult = (sixthOfX & sixthOfY) & (sixthOfZ ^ 1);
		
		int seventhOfX = (x & (1 << 6)) >> 6;
		int seventhOfY = (y & (1 << 6)) >> 6;
		int seventhOfZ = (z & (1 << 6)) >> 6;
		int seventhOfresult = (seventhOfX & seventhOfY) & (seventhOfZ ^ 1);
		
		int eightOfX = (x & (1 << 7)) >> 7;
		int eightOfY = (y & (1 << 7)) >> 7;
		int eightOfZ = (z & (1 << 7)) >> 7;
		int eightOfresult = (eightOfX & eightOfY) & (eightOfZ ^ 1);

		int result = firstOfresult | secondOfresult << 1 | thirdOfresult << 2| fourthOfresult << 3| fifthOfresult << 4| sixthOfresult << 5| seventhOfresult << 6| eightOfresult << 7;

		System.out.println(result);
		System.out.println(Integer.toBinaryString(result));
	}

}
