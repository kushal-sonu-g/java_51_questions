/*15. Implement a JAVA program to multiply two numbers using recursive multiplication.*/

class Multiply{
	
		static int result=0;
	static int multiply(int num1,int num2){
		if(num2 > 0){
			result=result+num1;
			return multiply(num1,num2-1);
		}
		else{
			return result;
		}
	}
	
	public static void main(String args[]){
		
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		//int result=0;
		
		
		int answer=multiply(num1,num2);
		
		System.out.println("product is : "+answer);
		
	}
}