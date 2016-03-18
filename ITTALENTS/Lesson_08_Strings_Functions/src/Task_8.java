import java.util.Scanner;


public class Task_8 {

	public static void main(String[] args) {
		System.out.println("Please enter a word");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.trim();
		word = word.toUpperCase();

		boolean isPal=true;
		
		for (int i = 0; i <= (word.length()/2); i++) {
			if(word.charAt(i)!=word.charAt(word.length()-1-i)){
				isPal=false;
			}
			
		}
		
		if(isPal==true){
			System.out.println("The word IS a palindrome");
		}
		if(isPal==false){
			System.out.println("The word is NOT a palindrome");
		}
		sc.close();

	}

}
