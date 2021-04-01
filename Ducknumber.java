/*26. Implement a Java program to check whether a number is a Duck Number or not
--if a number conatains zero in it then its a duck number*/

//using string here instead of integer coz from strin cla to int we loose the starting zeros

class Ducknumber{
	
	int check(String s,int length){ //not static so object should be created in main
		
		int startflag=0,flag=0,i=0;  //start flag for starting zeros, flag to check zero at any other places
		while(s.charAt(i)=='0' && i<length){
			startflag++;
			System.out.println(s.charAt(i));
			i++;
		}
		for(int j=i;j<length;j++){
			System.out.println(s.charAt(j));
			if(s.charAt(j)=='0'){
				flag++;
			}
		}
		if(startflag==0 && flag==0){
			return 1;
		}
		else if(startflag==0 && flag!=0){
			return 0;
		}
		else if(startflag !=0 && flag==0){
			return 1;
		}
		else
			
		return 0;
	}
	
	public static void main(String args[]){
		
		String input=args[0];
		int length=input.length();
		
		
		Ducknumber obj = new Ducknumber();
		
		int flag=obj.check(input,length);
		
		if(flag==0){
			System.out.println(input+" is a Duck number");
		}
		else{
			System.out.println(input+" not a Duck number");
		}
		
	}
 
 
}