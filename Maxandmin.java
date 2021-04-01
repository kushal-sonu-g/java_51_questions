/*13. Implement a JAVA program to find the max and min of given two numbers.*/
class Maxandandmin{
	
	public static void main(String args[]){
		
		float num1=Float.parseFloat(args[0]);
		float num2=Float.parseFloat(args[1]);
		
		if(num1 > num2){
			System.out.println("max is : "+num1+"\nmin is :"+num2);
		}
		else{
			System.out.println("max is : "+num2+"\nmin is :"+num1);
		}
	}
}