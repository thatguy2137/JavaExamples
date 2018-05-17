
public class Strings extends Instruments{

	public Strings(String name, double price, String typeOfSound) {
		super(name, price, typeOfSound);
	}

	public void play() {
		System.out.println("The String instrument was played");
	}
	
	public void changeStrings() {
		System.out.println("The strings were changed");
	}
}
