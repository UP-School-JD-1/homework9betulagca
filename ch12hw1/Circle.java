package ch12hw1;
public class Circle extends Shape {
	protected int r;

	public Circle(int r) {
		super("Circle");
		this.r = r;

	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	void draw() {
		System.out.println(" Circle ");
		super.draw();
	}

	void erase() {
		System.out.println("The circle is erased. ");
		super.erase();
	}

	double calculateArea() {
		area = Math.PI * r * r;
		return super.calculateArea();
	}


	double circumference() {
		circumference = 2 * Math.PI * r;
		return super.circumference();
	}

	
	public int hashCode() {
		return super.hashCode();
	}

	
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	
	public String toString() {
		return super.toString();
	}

}