package ch12hw1;
public class Square extends Shape {
	protected int z;

	void draw() {
		System.out.println(" Square ");
		super.draw();
	}

	void erase() {
		System.out.println("The square is erased. ");
		super.erase();
	}

	double calculateArea() {
		area = z * z; //kenar
		return super.calculateArea();
	}

	double circumference() {
		circumference = 4 * z;
		return super.circumference();
	}

	void printInfo() {
		super.printInfo();
	}

	public Square(int z) {
		super("This is a square");
		this.z = z;
	}

	public int getEdge() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

}