/*39. Implement a Java program that reads via CLA (size type) example: 1 KB / 1 MB, calculate the memory in bytes.*/

class Memory{
    
    public static void main(String args[]) {
        
		int num = Integer.parseInt(args[0]);
        
        switch(args[1])
        {
        
        case "KB":    System.out.println("Memory in bytes: "+(num * Math.pow(2,10)));
                    break;
        
        case "MB":    System.out.println("Memory in bytes: "+(num * Math.pow(2,20)));
                    break;
        
        case "GB":    System.out.println("Memory in bytes: "+(num * Math.pow(2,30)));
                    break;
        
        case "TB":    System.out.println("Memory in bytes: "+(num * Math.pow(2,40)));
                    break;
        default:     System.out.println("Wrong input");
                    break;
        }
    
    }

 

}