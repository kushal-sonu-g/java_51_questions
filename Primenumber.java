/*28. Implement a Java program to check if a given number is circular prime or not.*/

class Primenumber{
	
	static boolean check(int input){
		int i=input-1;
		
		while(i>1){
			if(input%i == 0){
				return false;
			}
			i--;
		}
		return true;
	}
	
	public static void main(String args[]){
		
		int input=Integer.parseInt(args[0]);
		boolean flag;
		
		if(input == 1){
			System.out.println(input+" is a prime number");
		}
		else if(input == 2){
			System.out.println(input+" is a prime number");
		}
		else{
			flag=check(input);
			
			if(flag == true){
				System.out.println(input+" is a prime number");
			}
			else{
				System.out.println(input+" not a prime number");
			}
		}
		
}
}