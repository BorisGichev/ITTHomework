package Task_2;

public class Call {

	private static final double PRICE_FOR_MINUTE = 0.20;

	private GSM caller;
	private GSM receiver;
	private double duration = 0;

	public GSM getCaller() {
		return caller;
	}

	public void setCaller(GSM caller) {
		if (caller == null) {
			return;
		}
		this.caller = caller;
	}

	public GSM getReceiver() {
		return receiver;
	}

	public void setReceiver(GSM receiver) {
		if (receiver == null) {
			return;
		}
		this.receiver = receiver;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		if (duration<0) {
			this.duration = 0;
			return;
		}
		this.duration = duration;
	}

	
	public static double getPriceForMinute() {
		return PRICE_FOR_MINUTE;
	}

}
