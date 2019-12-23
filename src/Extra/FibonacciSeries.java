import java.util.Scanner;
public class FibonacciSeries{

     public static void main(String []args){
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter no. of term ");
        int n=scn.nextInt();
        int n1=0,n2=1;
        for(int i=1;i<=n;i++)
        {
            if(i==1)
            System.out.print(n1+" ");
            else if(i==2)
            	System.out.print(n2+" ");
            else {
            int f=n1+n2;
            n1=n2;
            n2=f;
            System.out.print(f+" ");}
        }
        scn.close();
     }
}