/*11. Implement a JAVA program to implement a Full adder using Bitwise operator.
--sum = a xor b xor c*
-- carry = ab + bc + ca*/

class Fulladder{
	
	static int a,b,c,sum,carry;
	
	public static void main(String args[]){
		
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		
		sum = a ^ b ^ c;
		carry = (a & b) | (b & c) | (c & a);
		
		System.out.println("sum is : "+sum+"\ncarry is :"+carry);
	}
}