package url;



public class Container implements Comparable<Container>{
	private String word;
	private Integer count;
	private String marker;
	
	
	
	
	
	public Container(String word) {
		this.word = word;
		this.count=1;
	}
	@Override
	public String toString() {
		
		return word + ":" + count;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
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
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}
	public void increment() {
		this.count++;
		marker+="####";
	}
	
	public String getChar() {
		return this.word;
	}
	@Override
	public int compareTo(Container con) {
		int count1=this.count;
		int count2=con.count;
		
		if(count1>count2){
			return -1;
		}
		if (count1<count2) {
			return 1;
		}
		else {
			return this.getChar().compareTo(con.getChar());
		}
	}
	
	
	

}

