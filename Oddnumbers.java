/*8. Implement a JAVA program to find the odd numbers between 0-100.*/
class Oddnumbers{
	
	public static void main(String args[]){
		int i=0;
		for(i=0;i<=100;i++){
			if(i%2 != 0){
				System.out.print(i+" ");
			}
		}
	}
}