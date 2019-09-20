package Lab1;

public class Ex2 {
	public int calculateDifference(int n){
		int i=1,diff=0,sqs=0,sosq=0;
		for(i=1;i<=n;i++)
		{
			sqs+=i*i;
			sosq+=i;
		}
		diff=sqs-sosq*sosq;
		return diff;
	}
}
