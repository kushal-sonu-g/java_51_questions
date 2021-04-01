/*48. Implement a java program to find the memory size in bytes given the input as address length. */

import java.lang.Math;
class Memorysize{
	
	public static void main(String args[]){
		
		int addresslength=Integer.parseInt(args[0]);
		
		int memorysize=(int)Math.pow(2,addresslength);
		
		System.out.println(memorysize);  //if we are considering each size as 1 bytes
	}
}