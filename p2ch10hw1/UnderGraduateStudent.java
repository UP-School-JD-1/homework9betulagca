package p2ch10hw1;
import java.util.Date;

public class UnderGraduateStudent extends AbstractStudent {

	    String minor;

	    public UnderGraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
	        super(no, name, year, major);
	        this.minor = minor;
	    }

	    public String getMinor() {
	        return minor;
	    }

	    public void setMinor(String minor) {
	        this.minor = minor;
	    }

	    @Override
	    public void study() {
	    	System.out.println(name + " studies in the department of " + major + " and his/her minor department is " + minor);
	    }

	   
		@Override
		public void register() {
		
			System.out.println(getName() +  " who undergraduated student has been registered." );
		
		}

		@Override
		public String toString() {
			return "UnderGraduateStudent [minor=" + minor + ", no=" + no + ", name=" + name +  ", year=" + year +", major=" + major + "]";
		}

	
		
	    
	
}