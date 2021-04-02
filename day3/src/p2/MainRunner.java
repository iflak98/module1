package p2;

public class MainRunner {

	public static void main(String[] args) {
		
		Engine e1 = new Engine(2000);
		
		Car honda = new Car(e1);
		
		System.out.println(honda.getE().getPower());
		
		Engine e2 = new Engine(2400);
		honda.setE(e2);
		
		System.out.println(honda.getE().getPower());
		
		
	}
}