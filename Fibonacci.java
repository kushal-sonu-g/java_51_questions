/*21. Implement Java program to check if a given number is Fibonacci number or not.
-- if fibonacci then ( 5*N2 + 4 ) or ( 5*N2 – 4 ) is a perfect square*/

import java.lang.Math;

class Fibonacci{
	
	static int num,term1,term2,square1,square2,root1copy,root2copy;
	static double root1,root2;
	public static void main(String args[]){
		
		num=Integer.parseInt(args[0]);
		
		term1=(5*num*num+4);
		term2=(5*num*num-4);
		//System.out.println("term"+term);
		
		root1=Math.sqrt(term1);
		root2=Math.sqrt(term2);
		
		root1copy = (int)(root1);
		root2copy = (int)(root1);
		
		square1=root1copy*root1copy;
		square2=root2copy*root2copy;
		//System.out.println("square"+square);
		
		if((square1==term1)||(square2==term2)){
			System.out.println("a fibonacci number");
		}
		else{
			System.out.println("not a fibonacci number");
		}
		
		
	}
}
