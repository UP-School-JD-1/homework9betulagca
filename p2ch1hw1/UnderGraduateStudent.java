package p2ch1hw1;

import java.util.Date;

public class UnderGraduateStudent extends Student {

	private String minor;

	public UnderGraduateStudent(int no, String name, int year, Date dob, String major, String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public void study() {
		System.out.println(getName());
		super.study();
	}

	public void register() {
		System.out.println(getName());
		super.register();
	}

	public String toString() {
		return "UnderGraduateStudent [minor=" + minor + ", getNo()=" + getNo() + ", getName()=" + getName()
				+ ", getYear()=" + getYear() + ", getDob()=" + getDob() + ", getMajor()=" + getMajor() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}