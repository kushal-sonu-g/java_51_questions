//4. Implement a JAVA program to find the square of the number.

class Square{
	static int square=1;
	
	public static void main(String args[]){
		int input=Integer.parseInt(args[0]);
		
		square = input * input;
		
		System.out.println("square of the number : "+input+" is = "+square);
	}

}