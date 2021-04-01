/*19. Implement a Java program to calculate the Binomial Coefficient of two positive numbers.
--Recurrence formula (which is associated with the famous "Pascal's Triangle"):(n k)=(n−1 \ k−1)+(n−1\ k)*/

class Binomial{
	

	static int binomialCoeff(int n, int k){
		if(k > n)
			return 0;
		if(k == 0 || k == n)
			return 1;
		
		return binomialCoeff(n - 1, k - 1) + binomialCoeff(n -1, k);
	
	}
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int k = Integer.parseInt(args[1]);;
		System.out.printf("value of coeff(%d, %d) is %d", n, k, binomialCoeff(n, k));	
	}

}