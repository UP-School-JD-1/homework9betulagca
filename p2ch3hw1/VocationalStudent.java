package p2ch3hw1;
import java.util.Date;

public class VocationalStudent extends AbstractStudent {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, major);


	}

	@Override
	public void study() {
	
		System.out.println(getName() +  " who vocational student studies in the department of " + major );
	}
	@Override
	public void register() {
	
		System.out.println(getName() +  " who vocational student has been registered." );
	
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	

}