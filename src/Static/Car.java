package Static;

public class Car {
	static String type = "car";
	private String name;
	String model;
	String color;
	
	public Car  (String name, String model, String color) {
this.name = name;
this.color = color;
this.model = model;

}
	public String getType() {
		return type;
	}
	public String getname() {
		return name;
	}
}
