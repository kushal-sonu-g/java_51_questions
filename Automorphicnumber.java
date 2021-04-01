/*25. Implement a Java program check whether a number is an Automorphic number or not.
-- a number if its square end with the same number as itself then its a Automorphic number--
example :: 5 sqaure is 25 which is ending with 5*/

class Automorphicnumber{
	public static void main(String args[]){
		int input= Integer.parseInt(args[0]);
		int lastdigit,square;
		
		square=input*input;
		
		lastdigit=square%10;
		
		if(lastdigit==input){
			System.out.println(input+" is a Automorphic number");
		}
		else{
			System.out.println(input+" not a Automorphic number");
		}
	}
}