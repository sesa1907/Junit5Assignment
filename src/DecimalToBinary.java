
public class DecimalToBinary {
	
	static int  bin[]=new int[100], i = 0; 
	static String binary = "";   
	
	public static String Binary1(int num) {
	    if (num > 0) {
		    bin[i++] 	= num % 2;
		    num 		= num/2;
		    Binary1(num);
	    } 
	    
	    for(i = i-1 ;i >= 0 ;i--) {
	       binary += (bin[i]);
	    }
	    
	    return binary;
	}
	
	
	public static String Binary2(int num) {
		String binary = "";
		
		if (num > 0) {
			binary 		= String.valueOf(num % 2);
			num 		= num / 2;
			binary 		= Binary2(num) + binary;
		}
		
		return binary;
	}
	
}
