package Programs;

import java.util.Scanner;

public class number {
	
	   
	    int sum(int i,int num)
	    {
	        int s1=0;
	        for(int x=i;s1<num;x++)
	        {
	           
	                s1=s1+x;
	            
	        }
	        return (s1);
	    }
	    public static void main(String args[])
	    {
	        Scanner sc=new Scanner (System.in);
	        System.out.println("Enter a number");
	        int n=sc.nextInt();
	        int s;
	        number obj=new number();
	        for(int j=1;j<=n;j++)
	        {    
	        int ans=obj.sum(j,n);
	        s=0;
	        if(ans==n)
	        {
	            for(int y=j;s<n;y++)
	            {
	                s=s+y;
	                System.out.print(y+"  ");
	            }
	            System.out.println();
	        }
	        
	    }
	}
}

