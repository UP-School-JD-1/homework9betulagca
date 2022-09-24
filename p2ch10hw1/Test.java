package p2ch10hw1;

import p2ch1hw1.Student;

public class Test {
	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		Student st1 = registrationOffice.getAStudent();
		Student st2 = registrationOffice.getAStudent();
		Student st3 = registrationOffice.getAStudent();
		Student st4 = registrationOffice.getAStudent();
		Student st5 = registrationOffice.getAStudent();

		registrationOffice.registerStudent(st1);
		registrationOffice.registerStudent(st2);
		registrationOffice.registerStudent(st3);
		registrationOffice.registerStudent(st4);
		registrationOffice.registerStudent(st5);
	}


}
