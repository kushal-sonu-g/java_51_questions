/*32. Implement java program to find any number between 1 and n that can be expressed as the sum of two cubes in two (or more) different ways
--a^3+b^3=c^3+d^3   find a,b,c,d*/

class Sumofcubes{
	
	public static void main(String args[]){
	
	int n=Integer.parseInt(args[0]);
	int i,j,l,k,a,b,c,d;
	
	       for ( i = 1; i <= n; i++) {
             a = i*i*i;
            if (a > n) break;

            for ( j = i; j <= n; j++) {
                  b = j*j*j;
                if (a + b > n) break;

                 for ( k = i + 1; k <= n; k++) {
                     c = k*k*k;
                    if (c > a + b) break;

						for (l = k; l <= n; l++) {
                         d = l*l*l;
                        if (c + d > a + b) break;

 if (c + d  == a  + b ) {
                            System.out.print((a+b) + " = ");
                            System.out.print(i + "^3 + " + j + "^3 = "); 
                            System.out.print(k + "^3 + " + l + "^3"); 
                            System.out.println();
                        }
                    }
                }
            }
       }
    }
}
	
	
