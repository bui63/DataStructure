public class StringOperation {
   /* ------------- CHECK CHARACTER IS VOWEL OR NOT --------------*/
	
	boolean isVowel(char ch)
	{
		if(ch>='a' && ch<='z')
			ch=(char)(ch-32);///lower to upper case
		return ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
	}
	
	/* ---------------- COUNT THE FREQUENCY OF EACH CHARACTER ------------*/
	
	public void countFrequency(String str)
	{
		int count[]=new int[128];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>0)
				System.out.println((char)i+" -> "+count[i]);
		}
	}
	
	
	/*------------COUNT ONLY CHARACTER EITHER CAPITAL OR SMALL ----------*/
	
	public int [] countCharFrequency(String str)
	{
		int count[]=new int[26];
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				count[ch-65]++;
			}else if(ch>='a' && ch<='z')
			{
				count[ch-97]++;
			}
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]>0)
				System.out.println((char)(i+65)+" -> "+count[i]);
		}
		return count;
	}
	
	
	
	/*--------------- CHECK STRING IS PARNAGRAM OR NOT -----------------*/
	
	public boolean isParanagram(String str)
	{
		if(str.length()<26)
			return false;
			int count[]=new int[26];
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch>='A' && ch<='Z')
				{
					count[ch-65]++;
				}else if(ch>='a' && ch<='z')
				{
					count[ch-97]++;
				}
			}
			for(int i=0;i<count.length;i++)
			{
				if(count[i]==0)
					return false;
			}
		return true;
	}
	
	
	/*------------- CHECK GIVEN TWO STRING IS ARNAGRAM OR NOT -----------*/
	
	public boolean isArnagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
			return false;
		StringOperation so=new StringOperation();
		int ar1[]=so.countCharFrequency(str1);
		int ar2[]=so.countCharFrequency(str2);
		for(int i=0;i<ar1.length;i++)
		{
			if(ar1[i]!=ar2[i])
				return false;
		}
		return true;
	}
	
	
	
	/*----------------- CONVERT NUMBER TO SENTENCE ----------------*/
	 public void numberToSentence(int n,String s)
	 {
		 String  one[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thrteen","fourteen","fiveteen","sixteen","seventeen","eighteen","ninteen"};
		 String two[]= {"","","twenty","thirty","fourty","fivety","sixty","seventy","eighty","ninty"};
		 if(n<20)
			 System.out.print(one[n%100]);
		 else
			 System.out.print(two[n/10]+one[n%10]);
		 
		 if(n!=0)
			 System.out.print(s+" ");
      }
	 
	 
	 
	 
	 /*------------- Days Between Two Given Dates ----------------*/
	 
	 public int countDays(int dd,int mm,int yy)
	 {
		 int m[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		 if(yy%4==0 && yy%100==0 || yy%400==0)
			 m[2]=29;
			 
		 int days=dd;
		 
		 int y=yy-1;
		 days=days+y*365;
		 days=days+(y/4-y/100+y/400);
		 
		 for(int i=1;i<mm;i++)
		 {
			 days=days+m[i];
		 }
		 return days;
	 }
	 
	 
	 
	 
	 /*----------- Return Highest length world in a given String----------*/
	 public String highestWord(String str)
	 {
		 /*String sArr[]=str.split(" ");
		 String res=sArr[0];
		 for(int i=1;i<sArr.length;i++)
		 {
				 if(res.length()<=sArr[i].length())
				 {
					 res=sArr[i];
				 }

		 }*/
		 
		 //                     OR               
		 
		 String res="";
		 char ch[]=str.toCharArray();
		 for(int i=0;i<ch.length;i++)
		 {
			 String w="";
			 while(i<ch.length && ch[i]!=' ')
			 {
				 w=w+ch[i];
				 i++;
			 }
			 if(w.length() >res.length())
			 {
				 res=w;
			 }
		 }
		 return res;
	 }
	 
	 
	 
	 
	 /*----------- Return smallest length world in a given String----------*/
	 
	 public String smalleststWord(String str)
	 {
		 String res=str;
		 char ch[]=str.toCharArray();
		 for(int i=0;i<ch.length;i++)
		 {
			 String w="";
			 while(i<ch.length && ch[i]!=' ')
			 {
				 w=w+ch[i];
				 i++;
			 }
			 if(w.length() <res.length())
			 {
				 res=w;
			 }
		 }
		 return res;
	 }
	 
	 
	 
	 
	 /*------------Return most frequent character---------------*/
	 
	 public char mostFrequentChar(String str)
	 {
		 StringOperation so=new StringOperation();
			int ar[]=so.countCharFrequency(str);
			int res=0;
			int c=0;
			for(int i=0;i<ar.length;i++)
			{
				if(res<=ar[i])
				{
					res=ar[i];
					c=i;
				}
					
			}
		 return (char)(c+65);
	 }
	 
	 
	 
	 
	 /*-------------- Revrese Each World of Given String --------------*/
	 
	 public String reverseEachWorld(String str)
	 {
		 char ch[]=str.toCharArray();
		 str="";
		 for(int i=0;i<ch.length;i++)
		 {
			 int k=i;
			 while(i<ch.length && ch[i]!=' ')
			 {
				 i++;
			 }
			 int j=i-1;
			 while(j>=k)
			 {
				 str=str+ch[j];
				 j--;
			 }
			 if(i<ch.length)
			 {
				 str=str+ch[i];
			 }
			 
		 }
		 return str;
	 }
	 
	 
	 
	 /*----------- Reverse The Given String -------------*/
	 public String stringReverse(String str)
	 {
		 char ch[]=str.toCharArray();
		 str="";
		 for(int i=ch.length-1;i>=0;i--)
		 {
			 int k=i;
			 while(i>=0 && ch[i]!=' ')
			 {
				 i--;
			 }
			 int j=i+1;
			 while(j<=k)
			 {
				 str=str+ch[j];
				 j++;
			 }
			 if(i>=0)
				 str=str+ch[i];
		 }
		 return str;
	 }
	 
	 
	 
	 
	 /*------------------ COUNT Number Of Word in the Sentence ----------*/
	 public int countWords(String str)
	 {
		 int res=1;
		 char ch[]=str.toCharArray();
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]==' ')
			 {
				 res++;
			 }
		 }
		 return res;
	 }
	 
	 
	 
	 
	 /*-- Convert Every Word First Character in Capital and rest is in Small Letter ----*/
	 public String InitCap(String str)
	 {
		 char ch[]=str.toCharArray();
		 str="";
		 for(int i=0;i<ch.length;i++)
		 {
			 if(i==0 && ch[i]!=' ' || ch[i]!= ' ' && ch[i-1]==' ')
			 {
				 if(ch[i]>='a' && ch[i]<='z')
				 {
					 ch[i]=(char)(ch[i]-32);
				 }
			 }
			 else if(ch[i]>='A' && ch[i]<='Z')
			 {
				 ch[i]=(char)(ch[i]+32);
			 }
		 }
		 return new String(ch);
	 }
	 
	 
	 
	 
	 /*-- Convert Every Word First Character in Small and rest is in Capital Letter ----*/
	 public String reverseInitCap(String str)
	 {
		 char ch[]=str.toCharArray();
		 str="";
		 for(int i=0;i<ch.length;i++)
		 {
			 if(i==0 && ch[i]!=' ' || ch[i]!= ' ' && ch[i-1]==' ')
			 {
				 if(ch[i]>='A' && ch[i]<='Z')
				 {
					 ch[i]=(char)(ch[i]+32);
				 }
			 }
			 else if(ch[i]>='a' && ch[i]<='z')
			 {
				 ch[i]=(char)(ch[i]-32);
			 }
		 }
		 return new String(ch);
	 }
	 
	 
	 
	 
	 /*------------ Return Middle Word From Given Sentence -------------*/
	 public String middleWord(String str)
	 {
		 int n=new StringOperation().countWords(str);
		 String s[]=str.split(" ");
		 if(n%2!=0)
		 {
			 return s[n/2];
		 }
		 else
		 return s[n/2 - 1]+" "+s[n/2];
	 }
	 
	 
	 
	 
	 /*------------ Display Each Word with its Length From Given Sentence ---------------*/
	 public void eachWordLength(String str)
	 {
		 String s[]=str.split(" ");
		 for(int i=0;i<s.length;i++)
		 {
			 System.out.println(s[i]+" -> "+s[i].length());
		 }
	 }
	 
	 
	 
	 
	 /*------------- Return Sum of Number Present in The String ---------*/
	 public int sumOfNumber(String str)
	 {
		 int sum=0;
		 for(int i=0;i<str.length();i++)
		 {
			 int no=0;
			 char ch[]=str.toCharArray();
			 while(i<ch.length && ch[i]>='0' && ch[i]<='9')
			 {
				 int d=ch[i]-48;
				 no=no*10+d;
				 i++;
			 }
			 sum=sum+no;
		 }
		 return sum;
	 }
	 
	 
	 
	 

		/*----- Check The Given String  is Present in Given Sentence--*/
		public boolean checkStr(String parent,String child)
		{
			char c1[]=parent.toCharArray();
			char c2[]=child.toCharArray();
			for(int i=0;i<c1.length;i++)
			{
				int j=0;
				int k=i;
				while(k<c1.length && j<=c2.length && c2[j]==c1[k])
				{
					j++;
					k++;
				}
				if(j==c2.length)
					return true;
			}
			
			return false;
		}
		
		
		
		/*------- Return Biggest Number Present in String*/
		public int bigNumber(String str)
		{
			int res=0;
			int j=0;
			char ch[]=str.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				int l=0;
				int num=0;
				while(i<ch.length && ch[i]>='0' && ch[i]<='9')
				{
					num=num*10+(ch[i]-48);
					i++;
					l++;
					if((i+1)==ch.length)
					{
						break;
					}
					else if (ch[i+1]>='a' && ch [i+1]<='z' )
					{
						break;
					}
						
				}
				if(res<num)
				{
					res=num;
					j=l;
				}
			}
			return res;
		}
	 
		
		
		
		
		
		
	 }
