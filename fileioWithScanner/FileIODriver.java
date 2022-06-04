package fileioWithScanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIODriver {

	public static void main(String[] args) throws FileNotFoundException {
		
	    File file = new File("C:\\Users\\Dylan\\Desktop\\test.txt");
	    Scanner sc = new Scanner(file);

	    
	    String name;
	    int rank = 0;
	    long id;
	    
	    while (sc.hasNextLine()) {
	    	String withoutSpaces = sc.nextLine().replaceAll(" ", "");
	    	String[] currLine = withoutSpaces.split(",", 3);
	    	
	    	name = currLine[0];
	    	
	    	System.out.println("Name: " + name);
	    	
		    rank = Integer.parseInt(currLine[1]);
	    	
	    	System.out.println("Rank: " + rank);
	    	
	    	id = Long.parseLong(currLine[2]);
	    	
	    	System.out.println("ID: " + id);
	    }
	    
	    sc.close();

	}
}
