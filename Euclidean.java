/*17. Find the dictance between two points, using euclidean distance.*/
import java.lang.Math;

class Euclidean{
	
	static double x1,y1,x2,y2,firstterm,secondterm,distance;
	public static void main(String args[]){
		
		//first take first point (x1,y1)
		x1=Double.parseDouble(args[0]);
		y1=Double.parseDouble(args[1]);
		
		//enter the second point
		x2=Double.parseDouble(args[2]);
		y2=Double.parseDouble(args[3]);
		
		//distance=rootof((x2-x1)square-(y2-y1)square)
		firstterm=(x2-x1)*(x2-x1);
		secondterm=(y2-y1)*(y2-y1);

		distance = Math.sqrt(firstterm+secondterm);
			
		System.out.println("distance between ("+x1+","+y1+")and ("+x2+","+y2+") is "+distance);	
	}
	
}