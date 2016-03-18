package Taks_2;

public class CompuerDemo {

	public static void main(String[] args) {
		Computer dell = new Computer(2005, 100, 300, 200);
		Computer lenovo = new Computer(2009, 600, true, 3000, 2000, "Linux");
		Computer acer = new Computer(2009, 600, false, 3050, 2050, "Ubunto");
		
		
		System.out.println(dell.comparePrice(lenovo));
		System.out.println(lenovo.comparePrice(dell));
		System.out.println(lenovo.comparePrice(acer));
		System.out.println(lenovo.comparePrice(lenovo));
	

	}

}
