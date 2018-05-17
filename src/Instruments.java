
public class Instruments {

	private String name;
	private double price;
	private String typeOfSound;
	
	public Instruments(String name, double price, String typeOfSound) {
		this.name = name;
		this.price = price;
		this.typeOfSound = typeOfSound;
	}
	
	public void play() {
		System.out.println("The " + name + " was played");
	}
	
	
}
