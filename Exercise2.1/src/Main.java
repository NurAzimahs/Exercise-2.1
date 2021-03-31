
public class Main {

	public static void main(String[] args) {
		Badminton yonex = new Badminton();
		Badminton linning = new Badminton();
		
		yonex.brand = "Yonex";
		yonex.weight = "75g";
		yonex.colour = "Orange";
		
		linning.brand = "Linning";
		linning.weight = "76g";
		linning.colour = "Black";
		
		System.out.println("Brand 1 : " + yonex.brand + "\n" + "Weight : " + yonex.weight + "\n" + "Colour : "+ yonex.colour );
		yonex.printBehaviour();
		
		System.out.println();
		
		System.out.println("Brand 2 : " + linning.brand + "\n" + "Weight : " + linning.weight + "\n" + "Colour : "+ linning.colour );
		linning.printBehaviour();
	}

}
