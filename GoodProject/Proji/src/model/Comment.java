package model;

import java.time.LocalDateTime;

public class Comment implements IPoints {
	private StringBuilder text;
	private User commenter;
	private Content iBelongTo;
	private LocalDateTime timeOfPosting;
	private int points;

	Comment(String text) {
		this.timeOfPosting = LocalDateTime.now();
		this.points = 0;
		this.text = new StringBuilder(text);
	}

	public LocalDateTime getTimeOfPosting() {
		return timeOfPosting;
	}

	public String getText() {
		return text.toString();
	}

	public void addText(String text) {

		this.text.append(text);

	}

	public User getCommenter() {
		return commenter;
	}

	public void setCommenter(User commenter) {
		this.commenter = commenter;
	}

	public Content getIBelongTo() {
		return iBelongTo;
	}

	public void setIBelongTo(Content iBelongTo) {
		this.iBelongTo = iBelongTo;
	}

	public int getPoints() {
		return points;
	}

	private void setPoints(int points) {
		this.points = points;
	}

	@Override
	public void pointsUp() {
		this.setPoints(points + 1);

	}

	@Override
	public void pointsDown() {
		this.setPoints(points - 1);

	}

}
