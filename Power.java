/*18. Find the power of the number without using existing methods.*/

class Power{
	
	public static void main(String args[]){
		
		int base=Integer.parseInt(args[0]);
		int power=Integer.parseInt(args[1]);
		
		int result=1;
		
		while(power !=0){
			result=result*base;
			power--;
		}
		
		System.out.println(base+"^"+args[1]+" = "+result);
	}
}