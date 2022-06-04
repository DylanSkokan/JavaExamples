package objectSorting.cars;

public class SortingDriver {
	public static void main(String[] args) {
		Car car1 = new Car("Red", 100);
		Car car2 = new Car("Green", 110);
		Car car3 = new Car("Orange", 150);
		Car car4 = new Car("Blue", 90);
		
		Lot lot = new Lot();
		
		//add cars to traditional array
		lot.addCarArray(car1);
		lot.addCarArray(car2);
		lot.addCarArray(car3);
		lot.addCarArray(car4);
		
		//add cars to ArrayList
		lot.addCarArrayList(car1);
		lot.addCarArrayList(car2);
		lot.addCarArrayList(car3);
		lot.addCarArrayList(car4);
		
		System.out.println(lot);
		
		lot.sortCarArray();
		lot.sortCarArrayList();
		
		System.out.println(lot);
		
	}
}
