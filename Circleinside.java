/*47. Implement a java program to find whether a circle is inside another circle or not. (consider all the possibel cases)*/

import java.lang.Math;
class Circleinside{
	
	public static void main(String args[]){
		
		double x1=Double.parseDouble(args[0]);
		double y1=Double.parseDouble(args[1]); //(x1,y1) r1,cirlce 1
		double x2=Double.parseDouble(args[2]);
		double y2=Double.parseDouble(args[3]);
		double r1=Double.parseDouble(args[4]);
		double r2=Double.parseDouble(args[5]);//(x2,y2) r2,cirlce 2
		
		double distance=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		double min=0,max=0;
		if(r1>r2){
			min=r2;
			max=r1;
			
		}
		else{
			min =r1;
			max=r2;
		}
		
		if(distance+min < max ){  //case 1 
			System.out.println("circle is completely inside another circle without touching the circumferance");
		}
		else if(distance+min==max){
			System.out.println("circle is completely inside another circle  touching the circumferance");
		}
		else{
			System.out.println("circle is not completely inside other circle");
		}
		
	}
}