/*10. Implement a JAVA program to implement a Half adder using Bitwise operator. 
--sum = a xor b*
--carry = a and b*/

class Halfadder{
	
	static int a,b,sum,carry;
	
	public static void main(String args[]){
		
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		
		sum = a ^ b;
		carry = a & b;
		
		System.out.println("sum is : "+sum+"\ncarry is : "+carry);
	}
}