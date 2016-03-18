package speedy;

import java.time.LocalDateTime;


public class WorkerClient extends Client {

	public WorkerClient(String firstName, String cellPhone, String address) {
		super(firstName, cellPhone, address);
	}

	
	
	public void takePack(Pack pack,Client client){
		if(pack!=null){
			synchronized (this.getOffice()) {
				this.getOffice().addPack(pack);
				Protocol temp =this.getOffice().generateProtocol(pack, client);
				pack.setTimeTaken(LocalDateTime.now());
				
			}
		}
	}
	
	
	@Override
	public String toString() {
		return "WorkerClient [firstName()=" + getFirstName() + ", getCellPhone()="
				+ getCellPhone() + ", getCity()=" + getCity() + ", getId()="
				+ getId() + "]";
	}
	
	



}
