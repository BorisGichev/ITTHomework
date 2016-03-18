package Taks_2;

public class Computer {
	private int flag = 0;
	private int year;
	private double price;
	private boolean isNoteBook;
	private double hardDiskMemory;
	private double freeMemory;
	private String operationSystem;

	public Computer() {
		this.setNoteBook(false);
		this.setOperationSystem("Win XP");
	}

	public Computer(int year, double price, int hardDiskMemory, int freeMemory) {
		this();
		this.setYear(year);
		this.setPrice(price);
		this.setHardDiskMemory(hardDiskMemory);
		this.setFreeMemory(freeMemory);
	}

	public Computer(int year, double price, boolean isNoteBook,
			double hardDiskMemory, double freeMemory, String operationSystem) {
		this.flag = 0;
		this.setYear(year);
		this.setPrice(price);
		this.setNoteBook(isNoteBook);
		this.setHardDiskMemory(hardDiskMemory);
		this.setFreeMemory(freeMemory);
		this.setOperationSystem(operationSystem);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 0 && year < 2016) {
			this.year = year;
			return;

		}
		this.year = 2015;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
			return;
		}
		this.price = 0;
	}

	public boolean isNoteBook() {
		return isNoteBook;
	}

	public void setNoteBook(boolean isNoteBook) {
		if (flag == 0) {
			this.isNoteBook = isNoteBook;
			flag++;
			return;
		}
		return;
	}

	public double getHardDiskMemory() {
		return hardDiskMemory;
	}

	public void setHardDiskMemory(double hardDiskMemory) {
		if (hardDiskMemory > 0) {
			this.hardDiskMemory = hardDiskMemory;
			return;
		}
		this.hardDiskMemory = 0;
	}

	public String getOperationSystem() {
		return operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		if (operationSystem != null && operationSystem.length() != 0) {
			this.operationSystem = operationSystem;
			return;
		}
		this.operationSystem = "Undefined";

	}

	public double getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(double freeMemory) {
		if (freeMemory <= this.hardDiskMemory) {
			this.freeMemory = freeMemory;
		} else {
			System.out.println("Free memory exceeds hardDiskMemory");
		}
	}

	void changeOperationSystem(String newSystem) {
		if (newSystem.equals("") || newSystem.equals(null)
				|| newSystem.length() == 0) {
			return;
		} else {
			this.operationSystem = newSystem;

		}
	}

	void useMemory(int memoryInUse) {
		if (memoryInUse > this.freeMemory) {
			System.out.println("Not enough memory");
			return;
		}
		if (memoryInUse <= 0) {
			System.out.println("Please enter a valid value for memory in use");
			return;
		}

		this.freeMemory -= memoryInUse;

	}

	int comparePrice(Computer com) {
		if (com == null) {
			System.out.println("Invalid input");
			return -10;
		}
		if (this==com) {
			System.out.println("You are comparing a computer to itself, now why would you do that???");
		}

		if (this.getPrice() > com.getPrice()) {
			return -1;
		}
		if (this.getPrice() < com.getPrice()) {
			return 1;
		}
		return 0;
	}

}
