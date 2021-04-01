/*34. Implement a Java program to find all the narcissistic numbers between 1 and 1000. (same as armstrong number)*/
import java.lang.Math;

class Narcissistic{
	
	public static void main(String args[]){
		
		//int input=Integer.parseInt(args[0]);
		int length=0;
		int digit=0,sum=0;
		
		//System.out.println(length+" length\n"+input+" input");
		for(int input=1;input<1000;input++){
			int copy=input,input2=input;
			String s=Integer.toString(copy);
			length=s.length();
			//System.out.println(input);
			
		while(input2 !=0){
			digit=input2%10;
			//System.out.println(digit+" digit");
			//System.out.println(Math.pow(digit,length));
			sum=sum+(int)Math.pow(digit,length);
			//System.out.println(length+" length");
			//System.out.println(sum+" "+copy+" sum and copy");
			input2=input2/10;
		}
		if(sum==copy){
			System.out.println(copy);
		
		}
		sum=0;
		
		}
		
	}
}