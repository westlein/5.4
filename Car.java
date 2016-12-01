public class Car {
	private String color;
	private int horsePower;
	private double engineSize;
	private String make;
	private static int count = 0;
	/**
	nitialize values of Car's instance variables or the attributes
	*/
	public Car() {
		this("white", 250, 4.0, "Toyota");
		}
	public Car(String color, int horsePower, double engineSize, String make) {
		this.color = color;
		this.horsePower = horsePower;
		this.engineSize = engineSize;
		this.make = make;
		count++;	
	}
	
	public void setColor(String color) {
		this.color = color;
				
	}
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	public void setEngineSize(double engineSize) {
		this.engineSize = engineSize;
	}
		
	public void setMake(String make) {
		this.make = make;
	}
	public static int getCount() {
		return count;
	}
	public String getColor() {
		return color;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public String getMake() {	
		return make;
	}

	public boolean equals(Car car) {
		return this.color.equals(car.color) && this.horsePower == car.horsePower && this.engineSize == car.engineSize && this.make.equals(car.make);  
	}
	public String toString() {
		return "Color " + color + " horse Power " + horsePower + " engine size " + engineSize + " make " + make;
	}
}
