/*51. Find the hexadecimal equivalent for a given 4-digit binary number.*/


//we have Integer.toHexString()  fuction from decimal to hexadecimal
//  .toUpperCase()  
import java.lang.Math;

class Hexadecimal{
	
	public static void main(String args[]){
		
		//first convert from binary to decimal
		
		int binary=Integer.parseInt(args[0]);
		
		int decimal=0,i=0;
		
		String hexadecimal;
		
		while(binary != 0){
			
			decimal=decimal+binary%10*(int)Math.pow(2,i);
			i++;
			binary=binary/10;
		}
		
		hexadecimal= Integer.toHexString(decimal);
		hexadecimal=hexadecimal.toUpperCase();
		
		System.out.println("binary = "+args[0]+"  hexadecimal = "+hexadecimal);
		
	}
}