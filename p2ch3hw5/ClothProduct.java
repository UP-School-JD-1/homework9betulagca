package p2ch3hw5;
public class ClothProduct extends Product implements Locatable {

	protected String sex;
	protected String size;

	public ClothProduct(String description, String sku, String sex, String size, double price, double tax) {
		super(description, sku);
		this.sex = sex;
		this.size = size;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDepot() {
		String depotCloth = "Merkez";
		System.out.println("Depot place is in the " + depotCloth);
		return depotCloth;

	}

	public void Purchase() {
		System.out.println(" ( "+ sex +", "+ getSize() + ") is purchased at "+ "TL with "+ " TL tax from "+ " in ");	
		
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
	public void getPlace() {
		// TODO Auto-generated method stub
		return;
	}

}