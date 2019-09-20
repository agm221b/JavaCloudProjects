package Lab1;

public class Ex4 {
	public boolean checkNumber(int n){
		boolean b=false;
		int rem=3;
		while(n!=1)
		{
			rem=n%2;
			if(rem==1)
			{
				b=false;
				break;
			}
			n=n/2;
			
		}
		if(n==1)
			b=true;
		
		return b;
	}
}
