import java.util.Scanner;
public class Matrix {
	Scanner sc=new Scanner(System.in);
	
	/*-------------- Read Value From User ---------------*/
	int [][] readMatrix()
	{
		System.out.println("How Many Row and Column U Want In Your Matrix:");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][]a=new int[r][c];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	
	
	
	/*------------- Display Given Matrix ---------------*/
	
	void displayMatrix(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	/*------------ Return Sum of Two Square Given Matrix -----------*/
	
	int[][] matrixSum(int a[][],int b[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=b[i][j]+a[i][j];
			}
		}
		return a;
	}
	
	
	/*----------- Return biggest element from given Element ----------*/
	
	int givesBiggest(int a[][])
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(res<=a[i][j])
				{
					res=a[i][j];
				}
			}
		}
		return res;
	}
	
	
	/*------- count even number and odd number from given number -------*/
	
	void countEvenAndOdd(int a[][])
	{
		int ecount=0,ocount=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]%2==0)
					ecount++;
				else
					ocount++;
			}
		}
		System.out.println("Number of even and odd number in given Matrix respectivly"+ecount+" "+ocount);
	}
	
	
/*------- count +ve number and -ve number from given number -------*/
	
	void countPositiveAndNigetive(int a[][])
	{
		int pcount=0,ncount=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>=0)
					pcount++;
				else
					ncount++;
			}
		}
		System.out.println("Number of +ve and -ve number in given Matrix respectivly"+pcount+" "+ncount);
	}
	
	
	/*-------- Return Total Sum of each element of Given Matrix -------------*/
	
	int sumMatrixElement(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
		}
		return sum;
	}
	
	
	/*--------- Return Transpose of Given Square Matrix ---------*/
	
	int[][] transposeSquare(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a[i].length;j++)
			{
				int t=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=t;
			}
		}
		return a;
	}
	
	
	/*--------- Return Transpose of any Matrix ---------*/
	
	int[][] traspose(int a[][])
	{
		int res[][]=new int [a[0].length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[j][i]=a[i][j];
			}
		}
		return res;
	}
	
	
	/*----- Return matrix which is reverse the Diagonal of Given Matrix -----*/
	
	int[][] reverseDiagonal(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length/2;j++)
			{
				if(i==j)
				{
					int t=a[i][j];
					a[i][j]=a[a.length-1-i][a.length-1-j];
					a[a.length-1-i][a.length-1-j]=t;
				}
				if(i+j==a.length-1)
				{
					int t=a[i][j];
					a[i][j]=a[j][i];
					a[j][i]=t;
				}
			}
		}
		return a;
	}
	
	
	/*------ Method to reverse row element in the Given Matrix -------*/
	
	int[][] revrseRow(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length/2;j++)
			{
				int t=a[i][j];
				a[i][j]=a[i][a[i].length-1-j];
				a[i][a[i].length-1-j]=t;
			}
		}
		return a;
	}
	
	
/*------ Method to reverse column element in the Given Matrix -------*/
	
	int[][] revrseColumn(int a[][])
	{
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int t=a[i][j];
				a[i][j]=a[a.length-1-i][j];
				a[a.length-1-i][j]=t;
			}
		}
		return a;
	}
	
	
	/*----- Method to reverse 90 degree left of given Matrix -------*/
	
	int[][] rotate90Left(int a[][])
	{
		Matrix m=new Matrix();
		a=m.transposeSquare(a);
		a=m.revrseColumn(a);
		return a;
	}
	
	
	/*----- Method to reverse 90 degree left of given Matrix -------*/
	
	int[][] rotate90Right(int a[][])
	{
		Matrix m=new Matrix();
		a=m.transposeSquare(a);
		a=m.revrseRow(a);
		return a;
	}
	
	/*------- Display Rowise Biggest Number of Given Matrix -------*/
	
	void dispRowiseBig(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			int b=0;
			for(int j=0;j<a[i].length;j++)
			{
				if(b<a[i][j])
				{
					b=a[i][j];
				}
			}
			System.out.println("In "+(i+1)+" Row Biggest  Element -> "+b);
		}
	}
	
	
/*------- Display ColumnWise least Number of Given Matrix -------*/
	
	void dispColwiseLeast(int a[][])
	{
		for(int j=0;j<a.length;j++)
		{
			int b=a[0][j];
			for(int i=0;i<a.length;i++)
			{
				if(b>a[i][j])
				{
					b=a[i][j];
				}
			}
			System.out.println("In "+(j+1)+" column Least Element -> "+b);
		}
	}
	
	
	/*-------- Display The Row Which has Biggest sum ---------*/
	
	void dispRowWitchBigSum(int[][]a)
	{
		int sum=0,index=0,sum1=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				sum=sum+a[i][j];
			}
			if(sum1<sum)
			{
				sum1=sum;
				index=i;
			}
		}
		System.out.println("Biggest Sum Row Elements are ");
		for(int j=0;j<a[index].length;j++)
		{
			System.out.print(a[index][j]+" ");
		}
	}
	
	
	/*------- Display Diagonal Biggest Element (Primay and Secondary) -----*/
	
	void diagonalBigElement(int[][]a)
	{
		int pdia=0,sdia=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j && pdia<a[i][j])
				{
					pdia=a[i][j];
				}
				if(i+j==a.length-1 && sdia<a[i][j] )
				{
					sdia=a[i][j];
				}
			}
		}
		System.out.println("Primary Diagonal Biggest Element is "+pdia);
		System.out.println("Secondary Diaonal Biggest Element is "+sdia);
	}
	
	
	/*--------- Display spirial way of a given matrix ------------*/
	
	void spiral(int[][]a)
	{
		int n=a.length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
				System.out.print(a[i][k]+" ");
			for(int k=i;k<j;k++)
				System.out.print(a[k][j]+" ");
			for(int k=j;k>i;k--)
				System.out.print(a[j][k]+" ");
			for(int k=j;k>i;k--)
				System.out.print(a[k][i]+" ");
		}
		if(n%2==1)
			System.out.print(a[n/2][n/2]);
	}
	
	
	
	/*----------- Display reverse Spiral way of a given Matrix ----------*/
	
	void reverseSpiral(int[][]a)
	{
		int n=a.length;
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			for(int k=j;k>i;k--)
				System.out.print(a[i][k]+" ");
			for(int k=i;k<j;k++)
				System.out.print(a[k][i]+" ");
			for(int k=i;k<j;k++)
				System.out.print(a[j][k]+" ");
			for(int k=j;k>i;k--)
				System.out.print(a[k][j]+" ");
		}
		if(n%2==1)
			System.out.print(a[n/2][n/2]);
	}
}
