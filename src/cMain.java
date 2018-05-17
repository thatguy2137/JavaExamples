

public class cMain {
	public static void main(String[] args) {
	
		Instruments[] band = new Instruments[3];
			
		Instruments inst1 = new Strings("Guitar", 70, "Smooth");
		Instruments inst2 = new Strings("Bass", 100, "Funky");
		Instruments inst3 = new Drums("Drums", 200, "Loud", "Deer");
		
		//adding to array
		band[0] = inst1;
		band[1] = inst2;
		band[2] = inst3;
		
		for (int i = 0; i < band.length; i++) {
			band[i].play();
		}
		
	}
}
