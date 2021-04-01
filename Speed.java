/*41. Implement a Java program to takes the user for a distance (in meters) and the time was taken (as three numbers: hours, minutes, seconds), and display
 the speed, in meters per second,kilometers per hour and miles per hour (hint: 1 mile = 1609 meters).*/
 
 //cla distance hrs min sec
 class Speed{
	 
	 public static void main(String args[]){
		 
		 double distance=Double.parseDouble(args[0]); //meters
		 double hrs=Double.parseDouble(args[1]);
		 double min=Double.parseDouble(args[2]);
		 double sec=Double.parseDouble(args[3]);
		 
		 double mps,kmphr,mphr;
		 
		 double time=sec + (min * 60)+(hrs * 60 * 60);
		 
		 mps = distance/time;
		 
		 kmphr = 3.6 * mps;
		 
		 mphr = 2.23694 * mps;
		 
		 System.out.println("speed = "+mps+" mps\n"+kmphr+"kmphr\n"+mphr+"mphr");
	 }
 }