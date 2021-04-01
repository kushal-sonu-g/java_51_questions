/*23. Implement a Java program to check whether a number is a Harshad Number or not.
-- a number is a harshad number if it is divisible by its sum ie 12 is divisible by 1+2=3*/

class Harshad{
	public static void main(String args[]){
		
		int input=Integer.parseInt(args[0]);
		int sum=0,digit=0,inputcopy=input;
		
		while(inputcopy != 0){
			digit=inputcopy%10;
			inputcopy=inputcopy/10;
			sum=sum+digit;
		}
		
		if(input%sum == 0){
			System.out.println(input+" is a Harshad number");
		}
		else{
			System.out.println(input+" not a Harshad number");
		}
	}
}