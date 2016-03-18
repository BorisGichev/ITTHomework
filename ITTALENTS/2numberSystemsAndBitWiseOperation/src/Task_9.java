
public class Task_9 {

	public static void main(String[] args) {
		long x = 131069;
		long mark = 131072;
		
		
		long z=((x-mark)>>63)&1;
		

		long bigger=x -z*(x-mark);
		
		boolean res=(bigger==x);
		
		System.out.println(res);

	}

}
