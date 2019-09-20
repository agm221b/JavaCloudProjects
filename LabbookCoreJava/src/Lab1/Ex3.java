package Lab1;

public class Ex3 {
	public boolean checkNumber(int number){
		boolean b=false;
		int rem=0,num=0,i=0;
		while(number!=0)
		{
			rem=number%10;
			number=number/10;
			if(number%10 > rem)
			{
				b=false;
				break;
			}
		}
		if(number==0)
			b=true;
		
		return b;
	}
}
