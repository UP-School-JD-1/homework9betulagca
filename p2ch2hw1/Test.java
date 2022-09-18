package p2ch2hw1;

import p2ch1hw1.Student;

public class Test {
	public static void main(String[] args) {
		
		   RegistrationOffice registrationOffice=new RegistrationOffice();
		  
		    Student student = registrationOffice.getAStudent();
		     RegistrationOffice.registerStudent(student);
		     System.out.println(student);

				
			}

}
