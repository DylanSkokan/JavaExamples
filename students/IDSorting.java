package students;

public class IDSorting extends Student implements Comparable<Student>{

	IDSorting(String name, int rank, long identificationNumber) {
		super(name, rank, identificationNumber);
	}

	@Override
	public int compareTo(Student o) {
		return Long.compare(this.getIdentificationNumber(), o.getIdentificationNumber());
	}
}
