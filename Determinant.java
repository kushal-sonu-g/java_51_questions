/*16. Find the determinant, for the quadratic equations.
--deteminant is b2 - 4ac*/

class Determinant{
	
	public static void main(String args[]){
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		
		int determinant=(b*b)-(4*a*c);
		
		System.out.println("the determinant of quadratic equation is : "+determinant);
	}
}