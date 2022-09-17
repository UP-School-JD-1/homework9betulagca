package p2ch1hw1;

public class Test {

	public static void main(String[] args) {
		
   RegistrationOffice RegistrationOffice=new RegistrationOffice();
  
    Student student = RegistrationOffice.getAStudent();
     RegistrationOffice.registerStudent(student);
     System.out.println(student);

		
	}
		
}