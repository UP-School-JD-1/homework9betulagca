package p2ch3hw5;
public class OldComputer extends BaseProduct implements Locatable, Priceable
{

String place;
String depot;
Double price;
Double tax;
	
	
	public OldComputer(String sku, String description, double price, double tax, String depot, String place ) {
		super(sku, description);
		this.place = place;
		this.depot = depot;
		this.price = price;
		this.tax = tax;
	}

	public double getPrice() {
		System.out.println("Old Computer's price=" + price);
		return price;
	}

	public void setPrice() {		
	}

	public double getTax() {
		System.out.println("Old Computer's tax=" + tax);
		return tax;
	}

	public void setTax() {
	}
	@Override
	public String getDepot() {
		
		return depot;
	}

	public void setDepot() {
	
		
	}

	public void getPlace() {
	
		return 
		;
	}

	public void setPlace() {
		
	}

	public void Purchase() {
		
	System.out.println(description + "is purchased at "+ price + "TL with "+tax+ " TL tax from "+ depot+ " in "+place);	
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

}