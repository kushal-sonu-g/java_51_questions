/*27. Implement a Java program to check two numbers are Amicable numbers or not.*/
//the sum of perfect divisors of a given number is equal to the other number

class Amicable{
	
	public static void main(String args[]){
		
		
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		int sum1=0,sum2=0,num1copy=num1,num2copy=num2,num1divisors=1,num2divisors=1;
		
		while(num1divisors < num1){
			if(num1 % num1divisors == 0){
				sum1=sum1+num1divisors;
			}
			num1divisors++;
		}
		
		while(num2divisors < num2){
			if(num2 % num2divisors == 0){
				sum2=sum2+num2divisors;
			}
			num2divisors++;
		}
		
		
		System.out.println(sum1+" = "+num2copy+" sum1 and num2");
		
		System.out.println(sum2+" = "+num1copy+" sum2 and num1");
		
		if(sum1 == num2copy && sum2 == num1copy ){
	System.out.println(num1copy+" and "+num2copy+" are amicable numbers");
		}
		else{
			System.out.println(num1copy+" and "+num2copy+" are not amicable numbers");
		}
	}
}
