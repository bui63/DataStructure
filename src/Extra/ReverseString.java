import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Name");
		String st=scn.nextLine();
		String res=reverse(st);
		System.out.println(res);
		scn.close();

	}
	static String reverse(String st)
	{
		String res="";
		char[] ch=st.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			res=res+ch[i];
		}
		return res;
	}

}
