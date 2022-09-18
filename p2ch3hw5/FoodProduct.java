package p2ch3hw5;
import java.sql.Date;

public class FoodProduct extends Product implements Locatable,Priceable
{
	String place;
	String depot;
	Double price;
	Double tax;
	Date productionDate;
	int life;

	public FoodProduct(String sku, String description, Date productionDate, int life, String place, String depot, Double price, Double tax) {
		super(sku, description);
		this.place = place;
		this.depot = depot;
		this.price = price;
		this.tax = tax;
		this.productionDate = productionDate;
		this.life = life;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice() {
	
	}

	public double getTax() {
		return tax;
	}

	public void setTax() {
	
	}

	public void Purchase() {
		
    }

	public void setDepot() {
		
	}

	public void setPlace() {
	
		
	}
	@Override
	public void showThePrice() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showTheTax() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void purchase() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getDepot() {
		// TODO Auto-generated method stub
		return depot;
	}
	@Override
	public void getPlace() {
		// TODO Auto-generated method stub
		return;
	}


}