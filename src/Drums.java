
public class Drums extends Instruments{

	String hideType;
	
	public Drums(String name, double price, String typeOfSound, String hideType) {
		super(name, price, typeOfSound);
		this.hideType = hideType;
	}
	
	public void play() {
		System.out.println("Nice sound");
	}
	
	
	
}
