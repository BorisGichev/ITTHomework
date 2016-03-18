package biblioteka;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class History {
private LocalDateTime takingTime;
private LocalDateTime ReturningTime;


	public History(LocalDateTime takingtime) {
		this.setTakingTime(takingtime);
	}


	public LocalDateTime getTakingTime() {
		return takingTime;
	}


	public void setTakingTime(LocalDateTime takingTime) {
		this.takingTime = takingTime;
	}


	public LocalDateTime getReturningTime() {
		return ReturningTime;
	}


	public void setReturningTime(LocalDateTime returningTime) {
		ReturningTime = returningTime;
	}

}
