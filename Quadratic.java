
import java.lang.Math;

class Quadratic{
	public static void main(String args[]){
	
	
	double condition=0,root1=0,root2=0,realpart=0,imaginary=0;
	
		
	double a=Integer.parseInt(args[0]);
	
	double b=Integer.parseInt(args[1]);
	
	
	double c=Integer.parseInt(args[2]);
    
	condition=(b*b)-(4*a*c);
	
	
	if(condition > 0){
		
		root1=((-b)+Math.sqrt(condition))/(2*a);
		root2=((-b)-Math.sqrt(condition))/(2*a);
		System.out.print("root1 :"+root1+",root2 :"+root2);
	}
	else if(condition == 0){
		root1=root2=(-b)/(2*a);
		System.out.print("root1 :"+root1+",root2 :"+root2);
	}
	else if(condition < 0){
		realpart=(-b)/(2*a);
		imaginary=Math.sqrt(-(condition/(2*a)));
		System.out.print("root1 :"+realpart +"+j"+imaginary+",root2 :"+realpart+"-j"+imaginary);
			
		
	}
	
	//System.out.print(a);	
	}
}