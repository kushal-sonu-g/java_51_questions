/*22. Check whether the number is a palindrome number or not.*/

class Palindrome{
	
	static int input,reverse=0,copy,digit;
	public static void main(String args[]){
		
		input=Integer.parseInt(args[0]);
		
		copy=input;
		while(copy != 0){
			digit=copy%10; //taking last number
			copy=copy/10; // divide by 10;
			reverse= (reverse*10) +digit;
			
			
		}
		System.out.println("input : "+input);
		System.out.println("reverse : "+reverse);
		
		if(reverse==input){
			System.out.println(input+" is a palindrome");
		}
		else{
		System.out.println(input+" not a palindrome");
		}
	}
}