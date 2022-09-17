package p2ch1hw1;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
	}

	@Override
	public void study() {
		System.out.println(getName());
		super.study();
	}

	@Override
	public void register() {
		System.out.println(getName());
		super.register();
	}

	@Override
	public String toString() {
		return "VocationalStudent [getNo()=" + getNo() + ", getName()=" + getName() + ", getYear()=" + getYear()
				+ ", getDob()=" + getDob() + ", getMajor()=" + getMajor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}