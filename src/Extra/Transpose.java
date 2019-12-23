import java.util.*;
public class Transpose {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter row and Column");
		int r=scn.nextInt();
		int c=scn.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=scn.nextInt();
			}
			System.out.println();
		}
		int b[][]=new int[c][r];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{  
				b[j][i]=a[i][j];
			}
			System.out.println();
		}
		int d[][]=new int[r][r];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{  d[i][j]=0;
				for(int k=0;k<=r;k++)
				{
					int s=a[i][k]*b[k][j];
				  d[i][j]= d[i][j]+s;
				}
			}
			System.out.println();
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
