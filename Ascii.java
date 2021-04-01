//3. Implement a JAVA program to print the ASCII values of A-Z, a-z , 0-9.

class Ascii{
	static int d;
	static char ch;
	public static void main(String args[]){
		
		//d=ch;
		//System.out.printf("%d",d);    //no need for type conversion   but cant dirctly print the ch, copy that to a int datatype and then print
		System.out.print("The Ascii values of capital letters:");
		for(ch='A';ch<='Z';ch++){
			d=ch;
			System.out.print(d+" ");
			//System.out.printf("%d",ch);
		}
		System.out.print("\n The Ascii values of small letters:");
		for(ch='a';ch<='z';ch++){
			d=ch;
			System.out.print(d+" ");
			
		}
		System.out.print("\n The Ascii values 0-9:");
		for(ch='0';ch<='9';ch++){
			d=ch;
			System.out.print(d+" ");
		}
	}
	
}