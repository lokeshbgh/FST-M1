package activities;

public class Car {

		String color;
		String transmission;
		int make;
		int tyres;
		int doors;
		
	Car (String color, String transmission, int make) {
		this.color = color;
		this.transmission = transmission;
		this.make = make;		
		this.tyres = 4;
		this.doors = 4;

	}
	
	public void displayCharacteristics() {
		System.out.println("Color: " + color);
		System.out.println("Transmission type: " + transmission);
		System.out.println("Year of Makeing: " + make);
		System.out.println("No. of Tyres: " + tyres);
		System.out.println("No. of Doors: " + doors);
	}

	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	
	public void brake() {
		System.out.println("Car has stopped");
	}

}
