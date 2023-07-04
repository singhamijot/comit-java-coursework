package org.comit.comit_practice_java.practice;

class Rectangle{
	double height;
	double width;
	
	Rectangle(double h, double w)
	{
		this.height=h;
		this.width=w;
	}
	
	double area()
	{
		return this.height*this.width;
	}
	double perimeter()
	{
		return 2*(this.height+ this.width);
	}
}


public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(10,15);
		System.out.println("Area :"+r1.area());
		System.out.println("Perimeter :"+r1.perimeter());		
	}

}
