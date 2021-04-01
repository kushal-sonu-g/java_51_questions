/*14. Implement a JAVA program to find the Mean of given 5 numbers. */

class Mean{
	
	public static void main(String args[]){
		
		float num1= Float.parseFloat(args[0]);
		float num2= Float.parseFloat(args[1]);
		float num3= Float.parseFloat(args[2]);
		float num4= Float.parseFloat(args[3]);
		float num5= Float.parseFloat(args[4]);
		
		float mean=(num1+num2+num3+num4+num5)/5;
		
		System.out.println("The mean of 5 numbers "+num1+" "+num2+" "+num3+" "+num4+" "+num5+"="+mean);
	}
}