package p2ch3hw5;


public class ConsultancyProduct extends Product implements Priceable
{
Double price;
Double tax;


	public ConsultancyProduct(String sku, String description, Double price, Double tax) {
		super(sku, description);
		this.price = price;
		this.tax = tax;
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
		System.out.println(" is purchased at "+ this.price + "TL with "+tax + " TL tax.");	
		
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