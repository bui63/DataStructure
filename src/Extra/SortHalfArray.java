
public class SortHalfArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int k=5;
		sort(a,k);
	}

static int[] sort(int[] arr, int k) {
		
	int n=arr.length;
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=k;i<n;i++)
		{
			for(int j=k;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		return arr;
		
	}
}
