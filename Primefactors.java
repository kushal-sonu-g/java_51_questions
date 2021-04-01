/*20. Implemen a Java program to print all prime factors of a given number.*/
class Primefactors{
	static boolean check(int num){
		int i;
		for(i = 2; i < num; i++){
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		int num = Integer.parseInt(args[0]);
		int i;
		for(i = 2 ; i <= num ; i++)
		{
			if((num % i) == 0){
				if(check(i)){           //check if its prime
					System.out.println(i);
				}
			}
		}
		
	}
}