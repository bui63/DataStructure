import java.util.Scanner;
public class StringPalindrome {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String");
		String st=scn.nextLine();
		boolean res=palindrome(st);
		System.out.println(res);
		scn.close();
	}
	static boolean palindrome(String st)
	{
		String s="";
		for(int i=st.length()-1;i>=0;i--)
		{
			s=s+st.charAt(i);
			//System.out.println(s);
		}
		System.out.println(st);
		System.out.println(s);
		return s.equals(st);
	}
}
