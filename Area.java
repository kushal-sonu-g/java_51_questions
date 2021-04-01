/*46. Implement a java program to find the area of a) Circle b) Rectangle c) Square d) trapezoid
e)rhombus f) triangle*/

import java.lang.Math;
class Area{
	
	static double circle(double radius){
		double area=Math.PI*radius*radius;
		
		return area;
	}
	
	static double rectangle(double length,double breadth){
		double area=length*breadth;
		
		return area;
	}
	
	static double square(double side){
		return side*side;
	}
	
	static double trapezoid(double a,double b,double h){
		double area=((a+b)/2)*h;
		
		return area;
	}
	
	static double rhombus(double p,double q){
		double area=(p*q)/2;
		return area;
	}
	
	static double triangle(double base,double height){
		double area=(base*height)/2;
		return area;
	}
	
	public static void main(String args[]){
		
		System.out.println("area of circle = "+circle(2));
		System.out.println("area of rectangle = "+rectangle(1,2));
		System.out.println("area of square = "+square(2));
		System.out.println("area of trapezoid = "+trapezoid(1,2,3));
		System.out.println("area of rhombus = "+rhombus(1,2));
		System.out.println("area of triangle = "+triangle(2,2));
	}
}