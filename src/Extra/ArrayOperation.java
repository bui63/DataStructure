import java.util.Scanner;
public class ArrayOperation {
	Scanner sc=new Scanner(System.in);

	/*-------- Read the Array Element From User --------*/
	
	public int[] readArr()
	{
		System.out.println("How many element do u want to Enter:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" Values ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	
	
	
	/*-------- Display Array Element -----------*/
	
	public void dispArr(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	
	/*------- Merge Two Array One After Other --------*/
	
	public int[] merge(int []a1,int []a2)
	{
		int l=a1.length+a2.length;
		int resArray[]=new int[l];
		for(int i=0;i<a1.length;i++)
		{
			resArray[i]=a1[i];
		}
		for(int i=0;i<a2.length;i++)
		{
			resArray[a1.length+i]=a2[i];
		}
		return resArray;
	}
	
	
	
	
	/*--------- Merge Two Array in ZigZag way ---------*/
	
	public int[] zigZag(int a[],int []b)
	{
		int l=a.length+b.length;
		int res[]=new int[l];
		int i=0,k=0;
		while(i<a.length && i<b.length)
		{
			res[k++]=a[i];
			res[k++]=b[i];
			i++;
		}
		while(i<a.length)
		{
			res[k++]=a[i];
			i++;
		}
		while(i<b.length)
		{
			res[k++]=b[i];
			i++;
		}
		return res;
	}
	
	
	
	
	/*-------- Insert One Element in Given Array in Given position -----*/
	
	public int[] inssertArr(int[] arr,int element,int pos)
	{
		if(pos<0 || pos>=arr.length)
		{
			System.out.println("Wrong position");
			  return arr;	
		}
		else
		{
			int narr[]=new int[arr.length+1];
			narr[pos]=element;
			for(int i=0;i<arr.length;i++)
			{
				if(i<pos)
				{
					narr[i]=arr[i];
				}
				else
					narr[i+1]=arr[i];
			}
			return narr;
		}
	}
	
	
	
	
	/*-------- Delete Given Array Element ------------*/
	
	public int[] deleteArray(int [] arr,int element)
	{
		int pos=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				pos=i;
				break;
			}
		}
		if(pos==-1)
		{
			System.out.println("Element not Present:");
			return arr;
		}
		else
		{
			int narr[]=new int[arr.length-1];
			for(int i=0;i<arr.length-1;i++)
			{
				if(pos>i)
				{
					narr[i]=arr[i];
				}
				else
					narr[i]=arr[i+1];
			}
			return narr;
		}
	}
	
	
	
	
	/*--------- Delete Array Element by its Position -----------*/
	
	public int[] deleteArray(int pos,int arr[])
	{
		if(pos<0 || pos>=arr.length)
		{
			System.out.println("Deletion is not possible");
			return arr;
		}
		else
		{
			int narr[]=new int[arr.length-1];
			for(int i=0;i<arr.length-1;i++)
			{
				if(i<pos)
				{
					narr[i]=arr[i];
				}
				else
					narr[i]=arr[i+1];
			}
		return narr;
		}
	}
	
	
	
	
	/*-------- Insert One Array In Other Array ------------*/
	
	public int[] inssertArr(int[] a,int [] b,int pos)
	{
		if(pos<0 || pos>a.length)
		{
			System.out.println("Index out of bound");
			return a;
		}
		else
		{
			int na[]=new int[a.length+b.length];
			for(int i=0;i<a.length;i++)
			{
				if(i<pos)
				{
					na[i]=a[i];
				}
				else
					na[i+b.length]=a[i];
			}
			for(int i=0;i<b.length;i++)
			{
				na[pos+i]=b[i];
			}
			return na;
		}
	}
	
	
	
	/*-------- Find Biggest Element in Given Array ---------*/
	
	int biggestElement(int[]a)
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=res)
			{
				res=a[i];
			}
		}
		return res;
	}
	
	
	
	
	/*--------- Find Smallest Element inGiven Array ------------*/
	
	int smallestNumber(int[]a)
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=res)
			{
				res=a[i];
			}
		}
		return res;
	}
	
	
	
	
	/*-------- Sum Of All Element in Given Array-------------*/
	
	int sumArray(int[]a)
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
		}
		return res;
	}
	
	
	
	
	/*-------- Return Middle Element from Given Array --------*/
	
	int middleElement(int[]a)
	{
		int res=0;
		int l=a.length;
		if(l%2==0)
		{
			res=a[(l/2)-1]+a[l/2];
		}
		else
			res=a[l/2];
		
		return res;
	}

	
	/*-------- Display the Pair of Element whose sum is n ---------*/
	
	public void dispair(int[] a, int n) {
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==n)
					System.out.println(a[i]+" , "+a[j]);
			}
		}
		
	}
	
	
	/*---------- Display The Frequency of Each Element ------------*/
	
	public void dispFrequency(int a[])
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
			System.out.println(a[i]+" -> "+count);
		}
	}
	
	
	
	
	/*------- Display The Unique Element ------------*/
	
	int [] dispUnique(int []a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
		}
		int na[]=new int[n];
		for(int i=0;i<na.length;i++)
		{
			na[i]=a[i];
		}
		return na;
	}
	
	
	
	/* ----------- MINUS OF TWO ARRAY ------------*/
	
	int[] minusOfArray(int[]a,int [] b)
	{
		int na[]=new int[a.length];
		int in=0;
		for(int i=0;i<a.length;i++)
		{
			int f=1;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					f=0;
					break;
				}
			}
			if(f==1)
				na[in++]=a[i];
		}
		int minus[]=new int[in];
		for(int i=0;i<in;i++)
		{
			minus[i]=na[i];
		}
		return minus;
	}
	
	
	
	/*--------- UNION OF TWO ARRAY --------------*/
	
	int[] unionOfArray(int[]a,int [] b)
	{
		int l=a.length+b.length;
		int k=0;
		int na[]=new int[l];
		for(int i=0;i<a.length;i++)
		{
			na[k++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			int find=0;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					find=1;
					break;
				}
			}
			if(find==0)
				na[k++]=b[i];
		}
		int union[]=new int[k];
		for(int i=0;i<k;i++)
		{
			union[i]=na[i];
		}
		return union;
	}
	
	
	/*---------- INTERSECTION OF TWO ARRAY -----------*/
	
	int[] intersectionOfArray(int[]a,int [] b)
	{
		int l=a.length+b.length;
		int na[]=new int[l];
		int in=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					na[in++]=a[i];
					break;
				}
			}
		}
		int inter[]=new int[in];
		for(int i=0;i<in;i++)
		{
			inter[i]=na[i];
		}
		return inter;
	}
	
	
	/*--------- FIND nth BIGGEST ELEMENT IN DISTINCT ARRAY ELEMENT -----------*/
	
	public int biggest(int a[],int num)
	{
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
					count++;
			}
			if(count==num-1)
				b=a[i];
		}
		return b;
	}
	
	
	
	/*--------- FIND nth SMALLEST ELEMENT IN DISTINCT ARRAY ELEMENT -----------*/
	
	public int smallest(int a[],int num)
	{
		int b=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
					count++;
			}
			if(count==num-1)
				b=a[i];
		}
		return b;
	}
	
	
	
	/*--------- MERGE TWO SORTED ARRAYS ------------*/
	
	public int[] mergesort(int a[],int b[])
	{
		int l=a.length+b.length;
		int na[]=new int[l];
		int i=0,j=0,in=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				na[in++]=a[i];
				i++;
			}
			else
			{
				na[in++]=b[j];
				j++;
			}
		}
		while(i<a.length)
		{
			na[in++]=a[i++];
		}
		while(j<b.length)
		{
			na[in++]=b[j++];
		}
		return na;
	}
	
	
	
	
	/*----------- CHECK DOUBLICATE ARRAY --------------*/
	
	boolean isDublicate(int a[],int b[])
	{
		if(a.length!=b.length)
			return false;
		else
		{
			sort(a);
			sort(b);
			for(int i=0;i<a.length;i++)
			{
					if(a[i]!=b[i])
					{
						return false;
					}
					
			}
		}
		return true;
	}
	
	
	
	
	/*----------- SORT THE GIVEN ARRAY ------------*/
	
	public int[] sort(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		return a;
	}
	
	
	
	/*------------- ALTERNATE -VE AND +VE NUMBER ARRANGEMENT -----------*/
	
	
	
	
	
	
	
	
	
	
	
	
	/*-------- RETURN NUMBER OF EVEN NUMBER AND ODD NUMBER ----------*/
	
	int [] countEO(int[]a)
	{
		int c[]=new int[2];
		for(int i=0;i<a.length;i++)
		{
			c[a[i]/2]++;
		}
		return c;
	}
	
}
