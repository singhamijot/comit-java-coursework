package org.comit.comit_practice_java.practice;

class Circle{
	
	double radius;
	final double PI = 3.14;
	
	double area()
	{
		return PI*this.radius*this.radius;
	}
	double perimeter()
	{
		return 2*PI*this.radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}

public class Ex50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle();
		c1.setRadius(4.5);
		System.out.printf(" The radius is %f and Area : %.2f  Perimeter: %.2f \n",c1.getRadius(),c1.area(),c1.perimeter());
		
	}

}
