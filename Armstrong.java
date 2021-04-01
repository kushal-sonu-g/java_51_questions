//1. Implement JAVA program to check whether a given number is ARMSTRONG or not.
class Armstrong{
	public static void main(String args[]){
		int input=Integer.parseInt(args[0]);
		int copy=input,product=1,digit=0,count=0,i=0,sum=0;
		int inputcopy=copy;
		while(input != 0){
			digit=input%10;
			input=input/10;
			count++;
		}
		while(copy != 0){
			digit=copy%10;
			//System.out.println(digit);
		for(i=0;i<count;i++){ 
		
			product = product * digit;
			
		}
		copy=copy/10;
		sum=sum+product;
		//System.out.println("sum is"+sum);
		//System.out.println("product is"+product);
		product=1;
		}
		
		if(inputcopy == sum)
			System.out.println("It is a Armstrong number");
		else
			System.out.println("Not a Armstrong number");
	}
}