
public class SmallestOfArray {

	public static void main(String[] args) {
		int[] a= {6,2,8,12,9,1,45};
		int res=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>=res)
			{
				res=a[i];
			}
		}
		System.out.println(res);
	}

}
