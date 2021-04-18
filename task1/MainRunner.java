package task1;

public class MainRunner {

	public static void main(String[] args) {
		
	Engine hondaEngine = new Engine(1000); // type of A
		Engine tataEngine = new Engine(1200);  // type B
		
		
		// --- default features-----
		//  ---- Base model ---
		Car car1 = new Car(hondaEngine);
		car1.moveCarForward();
		
		// ---- new enhancements in old component ---
		// ---- do some changes in base engine --
		Engine e = car1.getEngine();
		e.setBasepower(e.getBasepower()+1);
		
		car1.moveCarForward();
		
		//--- Switch to new component ---
		// --- change engine ---
		car1.setEngine(tataEngine);
		car1.moveCarForward();
		
		MusicSystem Panasonic=new MusicSystem(true);
		Car car2=new Car(Panasonic);
		car2.playMusic();
		
		MusicSystem m=car2.getMs();
		m.setButton(false);
		car2.playMusic();
		
		
		Car[] car=new Car[2];
		car[0]=new Car(hondaEngine);
		
		car[1]=new Car(tataEngine);
		
		
		
	}
}
