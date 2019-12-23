import java.util.Date;

public class CalculateAge 
{
	    public static void main(String[] args){
		String d="10-02-1994";
		String dt[]=d.split("-");
		int BirthYear=Integer.parseInt(dt[dt.length-1]);
		Date d1=new Date();
		//System.out.println(d1);
		String s=""+d1;
		//System.out.println(s);
		String st[]=s.split(" ");
		int currentYear=Integer.parseInt(st[st.length-1]);
		int age=currentYear-BirthYear;
		System.out.println(age);
	}

}
