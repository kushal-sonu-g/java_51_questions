/*33. Implement a program to check if a number is Mersenne number or not.
--Mersenne number prime number of the form Mn = 2^n − 1
--find n if n is an integer then Mersenne number*/

class Mersenne{
	
	public static void main(String args[]){
		
		int input=Integer.parseInt(args[0]);
		
		double n;
		n=Math.log(input+1)/Math.log(2);
		
		System.out.println(n+"= n");
		System.out.println((int)n+" =(int) n");
		
		if(n==(int)n){
			System.out.println(input+" is a Mersenne number");
		}
		else{
			System.out.println(input+" not a Mersenne number");
		}
		
	}
}
