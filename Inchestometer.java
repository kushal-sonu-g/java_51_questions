/*38. Implement a Java program that reads a number in inches, converts it to meters(CLA)*/
//1 inch is equal to 0.0254 meters:

class Inchestometer{
	public static void main(String args[]){
		
		double num=Double.parseDouble(args[0]);
		
		double meter;
		meter=num*0.0254;
		
		System.out.println(num+" inch = "+meter+" meters");
	}
}