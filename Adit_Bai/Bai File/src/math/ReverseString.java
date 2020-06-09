package math;

public class ReverseString {
	
	public String reverse (String first) {
		String rev = "";
		for (int j = first.length(); j > 0; --j)
		{
			rev = rev + (first.charAt(j-1)); 
		}
		return rev;
	}

}