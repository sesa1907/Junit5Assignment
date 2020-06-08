
public class RevNum {
	
	public int revNum(int num) {	
		int res=0, n;
		n=num;
		while(n!=0) {
			num=n%10;
			res=(res*10)+num;
			n=n/10;
		}
		return res;
	}

}
