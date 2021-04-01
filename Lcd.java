/*50. Implement a java program to find the LCD of the given numbers.*/

class Lcd{
	
	public static void main(String args[]){
		
		int num1=Integer.parseInt(args[0]);
		int den1=Integer.parseInt(args[1]);
		int num2=Integer.parseInt(args[2]);
		int den2=Integer.parseInt(args[3]);
		
		System.out.println("the fractions are "+num1+"/"+den1+" and "+num2+"/"+den2);
		
		int max=(den1>den2)?den1:den2;
		
		//System.out.println("max is "+max);
		while(max%den1!=0  || max%den2 != 0 ){
			max++;
		}
		System.out.println(max+" is the lcd of "+den1+" and "+den2);
	}
}