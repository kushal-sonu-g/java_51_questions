/*44. Implement a java program to count the repeted occurance of a digit in a n-digit number.*/

class Occurance{
	
	public static void main(String args[]){
		
		int number=Integer.parseInt(args[0]);//the number
		int digit=Integer.parseInt(args[1]);//thedigit occurance to be counted
		int count=0,bit=0,numbercopy=number;
		
		while(number != 0){
			bit=number%10;
			if(digit==bit){
				count++;
			}
			number=number/10;
		}
		
		System.out.println("the number of occurance of "+digit+" in "+numbercopy+" is "+count);
	}
}