/*30. Implement a Java program to check a number is a cyclic or not.*/
//roatate the number and see if its perfectly divisible

class Cyclic{
	
	public static void main(String args[]){
		
		int input=Integer.parseInt(args[0]);
		
		String s=args[0];
		int length=s.length();
		
		int digit=0,i=0,number=1,inputcopy=input,numbercopy=0,count=0;
		
		while(i < length-1){
			
			number=number*10;
			i++;
		}
		numbercopy=number;
		
	//	System.out.println(number);
		i=0;
		while(i<length){		//roatating the number and checking wether it is perfectly divisible
			
			digit=input%10;
			number=number*digit;
			input=input/10;
			number=number+input;
			input=number;
			System.out.println(input);
			
			if(input%inputcopy == 0){
				count++;
			}
				
			i++;
			number=numbercopy;
		}
		if(count == length){
			System.out.println(inputcopy+" is a cyclic number");
		}
		else{
			System.out.println(inputcopy+" not a cyclic number");
		}
	}
}
