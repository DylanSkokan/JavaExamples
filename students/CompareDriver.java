package students;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class CompareDriver {
	public static void main(String[] args) throws FileNotFoundException {
		
		var student1 = new Student("Emma", 3 , 17931414);
		var student2 = new Student("Sally", 5 , 23431144);
		var student3 = new Student("Alan", 2 , 73234453);
		var student4 = new Student("Belle", 4 , 01345253);
		var student5 = new Student("Joan", 1 , 11023023);
		var student6 = new Student(null, 1 , 11023023);
		
		var nameSorting1 = new NameSorting(student1);
		var nameSorting2 = new NameSorting(student2);
		var nameSorting3 = new NameSorting(student3);
		var nameSorting4 = new NameSorting(student4);
		var nameSorting5 = new NameSorting(student5);
		var nameSorting6 = new NameSorting(student6);
		
		var nameSort = new ArrayList<NameSorting>();
		nameSort.add(nameSorting1);
		nameSort.add(nameSorting2);
		nameSort.add(nameSorting3);
		nameSort.add(nameSorting4);
		nameSort.add(nameSorting5);
		nameSort.add(nameSorting6);
	}
}