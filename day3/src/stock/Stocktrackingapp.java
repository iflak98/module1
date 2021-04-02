package stock;


public class Stocktrackingapp {

	public static void main(String[] args) {
	
		Stock s=new Stock("infosys",1300);
		
		
		System.out.println(s.getStockName()+" "+s.getStockPrice());
		
		s.changePrice(10, true);
		s.changePrice(20, false);
		
		//System.out.println(s.getStockName()+" "+s.getStockPrice());
		
	}

}