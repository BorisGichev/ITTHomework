package Task_2;

public class GSM {
	private String model = "";
	private boolean hasSimCard = false;
	private String simMobileNumber = "";
	double outgoingCallsduration = 0;
	double incomingCallsduration = 0;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	void insertSimCard(String simMobileNumber) {
		boolean allNumbers = true;
		for (int i = 0; i < simMobileNumber.length(); i++) {
			if (simMobileNumber.charAt(i) > '9'
					|| simMobileNumber.charAt(i) < '0') {
				allNumbers = false;
			}
		}
		if (allNumbers == true && simMobileNumber.startsWith("08")
				&& simMobileNumber.length() == 10) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		} else {
			System.out.println("Not valid number");
		}
	}

	void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = "";
	}

	void call(GSM reciever, double duration) {
		if (duration < 0) {
			System.out.println("Please enter a valid duration of the call!");
			return;
		}

		if (this.hasSimCard == false && reciever.hasSimCard == false) {
			System.out.println("The caller and the receiver have no SIM cards");
			return;
		}
		if (this.hasSimCard == false) {
			System.out.println("The caller has no SIM card");
			return;
		}
		if (reciever.hasSimCard == false) {
			System.out.println("The receiver has no SIM card");
			return;
		}

		if (this.simMobileNumber.equals(reciever.simMobileNumber)) {
			System.out
					.println("The caller and receiver have the same number, call not allowed!");
			return;
		}

		Call calling = new Call();
		calling.setDuration(duration);
		calling.setCaller(this);
		calling.setReceiver(reciever);

		this.lastOutgoingCall = calling;

		this.outgoingCallsduration += duration;

		reciever.lastIncomingCall = calling;
		reciever.incomingCallsduration += duration;
	}

	double getSumForCall() {
		if (this.outgoingCallsduration != 0) {
			return Math.round(this.outgoingCallsduration
					* Call.getPriceForMinute() * 10000000.0) / 10000000.0;
		} else {
			System.out.println("There are no outgoing calls made");
			return 0;
		}

	}

	void printForTheLastOutgoingCall() {
		if (this.lastOutgoingCall != null) {
			System.out.println("Info about last outgoing call:");
			System.out.println("Duration: " + this.lastOutgoingCall.getDuration());
			System.out.println("Receiver number: "
					+ this.lastOutgoingCall.getReceiver().getSimMobileNumber());
			System.out.println("My number: " + this.getSimMobileNumber());
			System.out.println("Price per minutes in euro: "
					+ Call.getPriceForMinute());
		} else {
			System.out.println("There is no last outgoing Call");
		}

	}

	void printForTheLastIncomingCall() {
		if (this.lastIncomingCall != null) {
			System.out.println("Info about last incoming call:");
			System.out.println("Duration: " + this.lastIncomingCall.getDuration());
			System.out.println("Caller number: "
					+ this.lastIncomingCall.getCaller().getSimMobileNumber());
			System.out.println("My number: " + this.getSimMobileNumber());
			System.out.println("Price per minutes in euro: "
					+ Call.getPriceForMinute());
		} else {
			System.out.println("There is no last incoming Call");
		}

	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model==null||model.length()==0) {
			this.model="Undefined";
			return;
		}
		this.model = model;
	}
}
