package Task_1;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer dell= new Computer();
		Computer lenovo= new Computer();

		dell.setHardDiskMemory(1024*200);
		dell.setFreeMemory(dell.getHardDiskMemory());
		dell.setNoteBook(true);
		dell.setOperationSystem("Windows");
		dell.setPrice(1600.50);
		dell.setYear(2009);
		
		lenovo.setHardDiskMemory(1024*1000);
		lenovo.setFreeMemory(lenovo.getHardDiskMemory());
		lenovo.setNoteBook(false);
		lenovo.setOperationSystem("Linux");
		lenovo.setPrice(800.50);
		lenovo.setYear(2015);

		dell.useMemory(100);

		lenovo.changeOperationSystem("Obunto");
		
		System.out.println("Dell`s parameters are:");
		System.out.println("HDD "+dell.getHardDiskMemory() +"MB");
		System.out.println("Free space "+dell.getFreeMemory()+"MB");
		System.out.println("Is notebook: "+dell.isNoteBook());
		System.out.println("OS "+dell.getOperationSystem());
		System.out.println("Price "+dell.getPrice());
		System.out.println("Year of manufacture "+dell.getYear()+"\n");
		
		System.out.println("Lenovo`s parameters are:");
		System.out.println("HDD "+lenovo.getHardDiskMemory()+"MB");
		System.out.println("Free space "+lenovo.getFreeMemory()+"MB");
		System.out.println("Is notebook: "+lenovo.isNoteBook());
		System.out.println("OS "+lenovo.getOperationSystem());
		System.out.println("Price "+lenovo.getPrice());
		System.out.println("Year of manufacture "+lenovo.getYear());
		
		
	}

}
