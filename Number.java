/*43. Implement a java program to print 1 to 100 without using numbers in the program.*/

class Number{
	
	public static void main(String args[]){
		
		int num = 'B'-'A';
		
		//int n='e';
		//System.out.println(n);
		while(num < 'e'){ //ascii of e is 101
			System.out.print(num+" ");
			num++;
	}
	}
}