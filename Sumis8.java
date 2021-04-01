/*9. Implement a JAVA program to find the number between 0 - 1000 where the sum is 8.
--take each i see if sum is 8 i.e, first take each number by %10 and do /10*/
class Sumis8{
	
	public static void main(String args[]){
		int i=0,copy=0,digit=0,sum=0;
		
		System.out.println("the numbers whose sum is 8 are : ");
		for(i=0;i<=1000;i++){
			copy=i;
			while(copy!=0){
				digit=copy%10;
				copy=copy/10;
				sum=sum+digit;
			}
			if(sum==8){
				System.out.print(i+" ");
			}
			sum=0;
		}
		
	}
}