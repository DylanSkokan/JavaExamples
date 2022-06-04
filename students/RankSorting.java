package students;

public class RankSorting extends Student implements Comparable<Student>{
	
	RankSorting(String name, int rank, long identificationNumber) {
		super(name, rank, identificationNumber);
	}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.getRank(), o.getRank());
	}
}