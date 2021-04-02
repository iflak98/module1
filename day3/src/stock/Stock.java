package stock;


public class Stock {

	private String stockName; // infosys
	private int stockPrice;  // 1300
	
	public Stock(String name, int price) {
		stockName = name;
		stockPrice = price;
	}
	
	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	public void changePrice(float percentageChange,boolean action)
	{
		float newprice;
		if(action)
		{
			newprice=(float) ((stockPrice*percentageChange)/100);
			System.out.println("raise of "+newprice);
		}
		else
		{
			newprice=(float) ((stockPrice*percentageChange)/100);
			System.out.println("fall of "+newprice);
		}
		
	}
	
}
