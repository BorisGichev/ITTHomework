package speedy;


public class WorkerDriver extends WorkerClient{

	public WorkerDriver(String firstName, String cellPhone, String address) {
		super(firstName, cellPhone, address);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "WorkerDriver [firstName()=" + getFirstName() + ", getCellPhone()="
				+ getCellPhone() + ", getCity()=" + getCity() + ", getId()="
				+ getId() + "]";
	}
	
	

	

}
