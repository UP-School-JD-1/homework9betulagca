package ch12hw1;
public class Rectangle extends Shape {

	protected int x;
	protected int y;

	public Rectangle(int x, int y) {
		super("Rectangle");
		this.x = x;
		this.y = y;
	}

	void draw() {
		System.out.println(" Rectangle ");
		super.draw();
	}

	void erase() {
		System.out.println("The regtangle is erased. ");
		super.erase();
	}

	double calculateArea() {
		area = x * y;
		return super.calculateArea();
	}

	double circumference() {
		circumference = 2 * (x + y);
		return super.circumference();
	}

	public String toString() {
		return "Rectangle [edge1=" + x + ", edge2=" + y + "]";
	}

	void printInfo() {
		super.printInfo();
	}

}