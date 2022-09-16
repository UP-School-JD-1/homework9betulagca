package ch12hw1;
import java.util.Objects;

public class Triangle extends Shape {
	protected int base;
	protected int edge;
	protected int height;

	public Triangle(int base, int edge, int height) {
		super("Triangle");
		this.base = base;
		this.edge = edge;
		this.height = height;
	}

	public String toString() {
		return "Triangle [base=" + base + ", edge=" + edge + ", height=" + height + "]";
	}

	void draw() {
		System.out.println(" Triangle ");
		super.draw();
	}

	public int hashCode() {
		return Objects.hash(base, edge, height);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Triangle other = (Triangle) obj;
		return base == other.base && edge == other.edge && height == other.height;
	}

	void erase() {
		System.out.println("The triangle is erased. ");
		super.erase();
	}

	double calculateArea() {
		area = (base * height) / 2;
		return super.calculateArea();
	}

	double circumference() {
		circumference = base + edge + height;
		return super.circumference();
	}

	void printInfo() {
		super.printInfo();
	}

}