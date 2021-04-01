/*31. Implement a Java program to display first 10 Fermat numbers.
-- fermat number =F{n}=2^{2^{n}}+1 */

import java.lang.Math;

class Fermat{
	public static void main(String args[]){
		
		double fermatnumber=0,power;
		
		System.out.println("fermatnumbers are : ");
		for(int i=0;i<10;i++){
			power=Math.pow(2,i);
			fermatnumber=Math.pow(2,power)+1;
			
			System.out.println(fermatnumber);
		}
	}
}