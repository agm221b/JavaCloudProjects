package Lab1;

public class Ex1 {
	
	public int calculateSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum+=i;
				//System.out.println(i);
			}
		}
		return sum;
	}

}
