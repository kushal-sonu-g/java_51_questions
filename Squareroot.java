//5. Implement a JAVA program to find the square root of the number. 
import java.lang.Math;

class Squareroot{
	static double squareroot;
	
	public static void main(String args[]){
		int input=Integer.parseInt(args[0]);
		squareroot=Math.sqrt(input);
		System.out.println("Square root of "+input+" = "+squareroot);
	}
}