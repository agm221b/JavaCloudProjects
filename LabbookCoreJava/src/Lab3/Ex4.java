package Lab3;

public class Ex4 {
	
	public void getFreq(char[] ch) {
		
		int freqS[]= new int[26];
		int freqL[]= new int[26];
		
		char cha;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
				freqS[ch[i]-97]++;
			if(ch[i]>=65 && ch[i]<=91)
				freqL[ch[i]-65]++;
		}
		int c=0;
		for (int i : freqS) {
			if(i!=0)
				System.out.println(i+": freq of "+(char)((c)+97));
			c++;
		}
		c=0;
		for (int i : freqL) {
			if(i!=0)
				System.out.println(i+": freq of "+(char)((c)+65));
			c++;
		}
		
	}
}
