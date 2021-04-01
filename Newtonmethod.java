/*6. Implement a JAVA program to find the square using newton raphson method.
root = 0.5 * (X + (N / X)) where X is any guess which can be assumed to be N or 1.*/

import java.lang.Math;
class Newtonmethod{
	
	public static void main(String args[]){
		
		double input=Double.parseDouble(args[0]);
		double x=input,root=0,l=.0001;           //l is the tolerance
		
		while(true){
		root= 0.5* (x+(input/x));
															//loop untill you get closer to the root 
		if (Math.abs(root - x) < l)
            break;
		
		x=root;
		}
		System.out.println("the square root of "+input+" is "+root);
		
	}
}