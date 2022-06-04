package scanner;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerDriver {
	
	public static void variousDataTypes(Scanner sc) {
		int userInt = sc.nextInt();
		
		/*
		Why does this crash?
		
		nextInt() only reads the integer, there is an invisible character from pushing enter called newline (\n)
		
		In order to correct the error, we have to add a line to eat up the leftover newline character: sc.nextLine();
		 */

		String userStrLine = sc.nextLine();
		
		double userDouble = sc.nextDouble();
		
		System.out.print(userInt + "\n" + userStrLine + "\n" + userDouble + "\n");
	}
	
	public static int[] getArray(Scanner sc, int length) {
		int[] userArray = new int[length];
		
		System.out.println("Enter " + length + " numbers.");
		for(int i = 0; i < length; i++) {
			userArray[i] = sc.nextInt();
		}
		
		return userArray;
	}

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println(Arrays.toString(getArray(sc, 2)));
	    variousDataTypes(sc);
	    
	    sc.close();
	}
}