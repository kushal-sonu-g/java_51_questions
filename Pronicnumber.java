/*24. Implement a Java program to check whether a number is a Pronic Number or Heteromecic Number or not.
--if a given number can be represented as n*(n+1) then it is a pronic number example 2 = 1*2--
steps :: 1)find the squareroot 
          2)find the floor of that root
		  3)if the product with next number is the given input then its a pronic number*/
		  
import java.lang.Math;

class Pronicnumber{
	public static void main(String args[]){
		
		double input=Double.parseDouble(args[0]);
		double floorvalue,result,root;
		
		root=Math.sqrt(input);
		
		floorvalue=Math.floor(root);
		
		result=floorvalue*(floorvalue+1);
		
		if(input == result){
			System.out.println(input+" is a pronic number");
		}
		else{
			System.out.println(input+" not a pronic number");
		}
	}
}