package students;

public class NameSorting extends Student implements Comparable<Student>{

	NameSorting(String name, int rank, long identificationNumber) {
		super(name, rank, identificationNumber);
	}
	
	NameSorting(Student student){
		super(student.getName(), student.getRank(), student.getIdentificationNumber());
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
	}
}