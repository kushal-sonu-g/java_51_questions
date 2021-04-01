/*7. Implement a JAVA program to find the GCF  and LCM of given numbers.
--to find lcm take the max of two numbers and divide that max by the two numbers until both the numbers 
after division gives remainder as zero if not increment the max number and again start this process.
--and for hcf go into loop to n1/i and n2/i must be zero,and keep on incrementing i until the min of two numbers .
--** hcf*lcm=n1*n2,   so calculate any one and find other using this formula*/

class HcfandLcm{
	
	
	 int Hcf(int num1,int num2){
		int i=0,hcf=0;
		int min=(num1<num2)?num1:num2;
		
		for(i=1;i<=min;i++){
			if(num1%i ==0 && num2%i == 0){
				hcf=i;
			}
		}
		//System.out.println(min);
		
		return hcf;
	}
	
	 int Lcm(int hcf,int num1,int num2){
		
		int lcm=(num1*num2)/hcf;
		
		return lcm;
	}
	public static void main(String args[]){
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		
		HcfandLcm obj1=new HcfandLcm();
		//Lcm obj2=new Lcm(); //here we should give the class name as constructor not the method name when static not used
		
		int hcf=obj1.Hcf(num1,num2);
		int lcm=obj1.Lcm(hcf,num1,num2);
		
		System.out.println("hcf is : "+hcf);
		System.out.println("lcm is : "+lcm);
		
	}
}
