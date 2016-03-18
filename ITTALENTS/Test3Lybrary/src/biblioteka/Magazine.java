package biblioteka;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Magazine extends ReadingMaterial {
	private LocalDateTime issueDate;
	private int issue;

	@Override
	public String toString() {
		return "Magazine [issueDate=" + issueDate + ", issue=" + issue
				+ ", getName()=" + getName() + ", getPublisher()="
				+ getPublisher() + "]";
	}

	public Magazine(LocalDateTime issueDate, int issue, String name,
			String publisher) {
		super(name, publisher);
		this.issueDate = issueDate;
		this.setIssue(issue);
	}

	@Override
	public int getTime() {
		return -1;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return -1;
	}

	public int getIssue() {
		return issue;
	}

	public void setIssue(int issue) {
		this.issue = issue;
	}

	@Override
	public Comparator getComarator() {
		return new Comparator<Magazine>() {
			@Override
			public int compare(Magazine o1, Magazine o2) {
				if (o1.getName().compareTo(o2.getName()) == 0) {
					return o1.getIssue() - o2.getIssue();
				}
				return o1.getName().compareTo(o2.getName());
			};

		};
	}
	
	public boolean canBetaken(){
		return false;
	}

}
