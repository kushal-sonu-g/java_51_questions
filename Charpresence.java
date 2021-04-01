/*45. Implement a java program to check whether there is any occurance of characters in a n-digit input number.*/

class Charpresence{
	
	public static void main(String args[]){
		
		String s=args[0];
		
		int length=s.length();
		int i=0;
		int flag=0;
		char ch;
		for(i=0;i<length;i++){
			ch=s.charAt(i);
			if(ch<'0' || ch>'9'){
				
				
				flag++;
			}
			
		}
		if(flag!=0){
			System.out.println("character is present");
		}
		else{
			System.out.println("character is not present");
		}
	}
}