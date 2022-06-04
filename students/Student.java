package students;

public class Student {
	private String name;
	private int rank;
	private long identificationNumber;
	
	
	Student (String name, int rank, long identificationNumber) {
		this.name = name;
		this.rank = rank;
		this.identificationNumber = identificationNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rank=" + rank + ", identificationNumber=" + identificationNumber + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public long getIdentificationNumber() {
		return identificationNumber;
	}
	public void setIdentificationNumber(long identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
}
