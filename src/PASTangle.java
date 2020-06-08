public class PASTangle {
	
	public static String Pyramid(int num, char style) { 
		String pyramid = "";
		
		for(int i = 1; i <= num; i++) {
		    for(int j=0; j < num-i; j++) {
		    	pyramid += " ";
	        }
		    
	        for(int j = 0; j < (i*2)-1; j++) {
	            pyramid += style;
	        }
	        
	        pyramid += "\n";
	    }      
		
		return pyramid;
    }
	
}
