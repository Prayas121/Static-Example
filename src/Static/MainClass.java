package Static;
import java.util.ArrayList;

public class MainClass {
	static String name = "Prayas";
	public static void main(String[] args) {
		Car tesla = new Car("tesla", "black" ,"black");
		Car ford = new Car("Bike", "Red","black");
		Car hyundai = new Car ("hyundai", "hp", "black");
		Car maruti = new Car("maruti ", "hp", "black");
		
		System.out.println(tesla.getname());
		
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(tesla);
		cars.add(ford);
		cars.add(hyundai);
		cars.add(maruti);
		System.out.println(cars.size());
		
		
	}

}
