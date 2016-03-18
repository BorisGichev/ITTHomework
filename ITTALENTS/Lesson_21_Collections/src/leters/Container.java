package leters;

public class Container implements Comparable<Container> {
	private static final int MAX_MARKER = 20;
	private Character letter;
	private Integer count;

	public Container(Character letter) {
		this.letter = letter;
		this.count = 1;

	}

	@Override
	public String toString() {

		if (count > 99) {
			return letter + ":" + count + " ";
		}
		if (count > 9) {
			return letter + ":" + count + "  ";
		}
		return letter + ":" + count + "   ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((letter == null) ? 0 : letter.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Container other = (Container) obj;
		if (letter == null) {
			if (other.letter != null)
				return false;
		} else if (!letter.equals(other.letter))
			return false;
		return true;
	}

	public void increment() {
		this.count++;

	}

	public Character getChar() {
		return this.letter;
	}

	public int getCount() {
		return this.count;
	}

	@Override
	public int compareTo(Container con) {
		int count1 = this.count;
		int count2 = con.count;

		if (count1 > count2) {
			return -1;
		}
		if (count1 < count2) {
			return 1;
		} else {
			return this.getChar().compareTo(con.getChar());
		}
	}

	public void ptintMarker(double letterTotal) {
		for (int times = 0; times < (this.count / letterTotal) * MAX_MARKER; times++) {
			System.out.print("#");
		}
		System.out.print("\n");
	}

}
