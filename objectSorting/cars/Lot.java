package objectSorting.cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lot {

	// Array data structure
	int numCars = 0;
	Car[] arrayCars = new Car[numCars];

	// ArrayList data structure
	ArrayList<Car> arrayListCars = new ArrayList<Car>();

	@Override
	public String toString() {
		return "--LOT--" + "\nCars: " + numCars + "\nTraditional Array: " + Arrays.toString(arrayCars) + "\nArrayList: " + 
					arrayListCars.toString();
	}

	/*
	 * Adding a car to the lot using a traditional array
	 */
	public void addCarArray(Car car) {
		// increment number of cars
		numCars++;

		// create new array with new bigger size of cars
		Car[] newCars = new Car[numCars];

		// get the cars we already have and add them to the new array
		for (int i = 0; i < arrayCars.length; i++) {
			newCars[i] = arrayCars[i];
		}

		// set the last index of the new array to our new car
		newCars[numCars - 1] = car;

		// assign arrayCars as our new array
		arrayCars = newCars;
	}

	/*
	 * Adding a car to the lot using an ArrayList
	 */
	public void addCarArrayList(Car car) {
		arrayListCars.add(car);
	}
	
	/*
	 * Sorting cars in lot by ascending weight using bubble sort on traditional array
	 */
	public void sortCarArray() {
		Car tempCar;
		boolean sorted = false;
		
		while(sorted == false) {
			sorted = true;
			for(int i = 0; i < arrayCars.length - 1; i++) {
				
				//if the current number is greater than the one after, swap them and
				//mark the array as not sorted
				
				//sorted will only ever be true if this if statement is not entered
				//which would mean all the numbers are in ascending order
				if(arrayCars[i].getWeight() > arrayCars[i + 1].getWeight()) {
					tempCar = arrayCars[i + 1];
					arrayCars[i + 1] = arrayCars[i];
					arrayCars[i] = tempCar;
					sorted = false;
				}
			}
		}
	}
	
	/*
	 * Sorting cars in lot by ascending weight using sort method and Comparable on ArrayList
	 */
	public void sortCarArrayList() {
		Collections.sort(arrayListCars);
	}
}
