/*42. If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu. Charu is how many years younger than Iqbal?
 Generalize this program and provide a JAVA program to get input and find the age.*/
 
 class Age{
	 
	 public static void main(String args[]){
		 
		 int Iqbal=Integer.parseInt(args[0]);
		 int Shikhar=Integer.parseInt(args[1]);
		 int Charu=Iqbal-12;
		 
		 
		 
		 System.out.println("charu is 12 years younger tham Iqbal and age is "+Charu);
		 
		 int age1=Iqbal+Shikhar;
		 int age2=Shikhar+Charu;
		 
		 System.out.println(age1+" "+age2);
		 
	 }
 }