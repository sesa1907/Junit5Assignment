
public class ReverseofaString {
	
	String n;
	char[] reversed;
	
	public char[] reverseString(String n) {	
		char[] ch = n.toCharArray(); 
		int j=ch.length;
//		reversed[0]="";
		for(int i=j;i>0;i--)
		{
			reversed[j-i+1] = (ch[i-1]);
		}
		
		return reversed;
	}
 	
//	public static void main(String[ ] arg)
//	{
//	String str;
//	Scanner scan=new Scanner(System.in);
//	System.out.print("Enter a string : ");
//	str=scan.nextLine();	
//	char[] ch=str.toCharArray(); 
//	System.out.println("Reverse of a String is :"); 
//	int j=ch.length;
//	for(int i=j;i>0;i--)
//	{
//	System.out.print(ch[i-1]); 
//	}
//	}

}
