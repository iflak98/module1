package p1;


public class CarApp {
	public static void main(String[] args) {
		
		Car bmw = new Car();
		Car hector = new Car();
		Car tata = new Car();
		Car hyundai = new Car();
		Car dodge = new Car();
		
		
		bmw.setCarName("BMW X5");
		bmw.setChasisNumber(2329865);
		bmw.setMileage(24.34f);
		bmw.setModelNumber(2020);
		bmw.setModeofTrans("Auto Transmission");
		bmw.setPrice(23_00_000);
		bmw.setSalesman("Terry");
		
		bmw.changePrice();
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getPrice()+"\n"+
		bmw.getCarName()+"\n"+
		bmw.getModeofTrans());
		
		
		
		
		
	}

}
