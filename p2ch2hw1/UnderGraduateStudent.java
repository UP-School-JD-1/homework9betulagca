package p2ch2hw1;
import java.util.Date;

public class UnderGraduateStudent extends Student {

	    String minor;

	    public UnderGraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
	        super(no, name, year, dob, major);
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
			return "UndergraduateStudent [minor=" + minor + ", no=" + no + ", name=" + name + ", year=" + year
					+ ", major=" + major + ", dob=" + dob + "]";
		}

	
		
	    
	
}