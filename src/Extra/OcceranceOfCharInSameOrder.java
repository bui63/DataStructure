
public class OcceranceOfCharInSameOrder {
	public static void main(String[] args) {
		String st="aaAAnlsas";
		char[] ch=st.toCharArray();
		int n=ch.length;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(j<i && ch[i]==ch[j])
					break;
				if(ch[i]==ch[j])
					count++;
				if(j==n-1)
					System.out.println(ch[i]+""+count);
			}
			
		}
		
	}
}
