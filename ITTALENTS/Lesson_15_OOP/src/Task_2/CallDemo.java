package Task_2;

public class CallDemo {

	public static void main(String[] args) {
		GSM vnuche = new GSM();
		GSM baba = new GSM();

		vnuche.setModel("Nokia");
		baba.setModel("Simens");

		vnuche.insertSimCard("0807615547");
//		System.out.println(vnuche.getSimMobileNumber());

		baba.insertSimCard("0807615546");
//		System.out.println(baba.getSimMobileNumber());

		vnuche.call(baba, 9.5);
		baba.call(vnuche, 4.5);
		
		System.out.println(vnuche.incomingCallsduration);
		System.out.println(vnuche.outgoingCallsduration);
		
		vnuche.printForTheLastOutgoingCall();
		System.out.println();
		vnuche.printForTheLastIncomingCall();
		
		System.out.println(baba.incomingCallsduration);
		System.out.println(baba.outgoingCallsduration);
		
		baba.printForTheLastOutgoingCall();
		System.out.println();
		baba.printForTheLastIncomingCall();
		
		
		System.out.println("The value of all outgoing calls of Vnuche is "
				+ vnuche.getSumForCall() + " euro.");
		
		System.out.println("The value of all outgoing calls of Baba is "
				+ baba.getSumForCall() + " euro.");
		
	}

}
