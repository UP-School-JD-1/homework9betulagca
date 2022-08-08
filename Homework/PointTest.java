package Homework;

public class PointTest {
	public static void main(String[] args) {
		Point point = new Point(3, 4);
		
		System.out.println("X coordinate of the point:" + point.getX());
		System.out.println("Y coordinate of the point:" + point.getY());
		
		System.out.println("Noktanin orjinden uzakligi:" + point.distanceToOrigin());
		
	}
	
}
