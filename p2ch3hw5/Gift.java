package p2ch3hw5;
public class Gift extends BaseProduct implements Locatable{

String depot;
String place;


public Gift(String sku, String description, double price, double tax) {
	super(sku, description);
	
	
}


public void setDepot() {

	
 }

public void getPlace() {

;
return;
 }

public void setPlace() {

	
 }

public void prepare() {
	System.out.println("Gift is ready at" + depot + "depot in" + place );
 }


@Override
public String getDepot() {
	// TODO Auto-generated method stub
	return depot;
}

}