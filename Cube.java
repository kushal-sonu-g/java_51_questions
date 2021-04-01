//29. Implement a Java program to check a number is a cube or not.
//we have cbrt for cuberoot

import java.lang.Math;

class Cube{
	
	public static void main(String args[]){
		
		double input=Integer.parseInt(args[0]);
		double cuberoot=0,cube=0;
		
		cuberoot=Math.cbrt(input);
		cuberoot=Math.round(cuberoot);
		
		//System.out.println("cuberoot = "+cuberoot);
		cube=cuberoot*cuberoot*cuberoot;
		
		
		//System.out.println(input+" , "+cube+" input and cube ");
		if(input==cube){
			System.out.println(input+" is a cube");
		}
		else{
			System.out.println(input+" not a cube");
		}
	}
}