public class DemoTest {


	
		public String name;
	
		public void run() {
			System.out.println("1");
			try {
				System.out.println("2");
				name.toString();
				System.out.println("3");
			} catch (NullPointerException e) {
				System.out.println("4");
				throw e;
			}
			System.out.println("5");
		}
	

	public static void main(String[] args) {
		DemoTest jery = new DemoTest();
		jery.run();
		System.out.println("6");
	}

}
