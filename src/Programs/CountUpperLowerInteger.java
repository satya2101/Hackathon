package Programs;

import java.util.Scanner;

public class CountUpperLowerInteger {

	public static void main(String[] args) {
		String str;
		int upper=0,lower=0;
		Scanner scan=new Scanner(System.in); 
		System.out.println("we have the integer pre declared enter only string  ");
		str=scan.nextLine();
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				upper++;
			}
			else if(ch>='a' && ch<='z')
			{
				lower++;
			}
		}
		int num[]={7,2,6,1,4,7,4,5,4,7,7,3,1};
		boolean dup; 
		System.out.println("Enter integer ");
		for(int j=0;j<num.length;j++)
		{
			boolean dup1=false;
			int k=0;
			
			while(k<j)
			{
				if((j!=k) && num[j]==num[k])
					dup1=true;
			}
			k++;
		
		if(dup1){
			
			System.out.print(num[j]+" ");
		}
		
		System.out.println("lowercase letters: "+lower);
		System.out.println("uppercase letters: "+upper);
	}

}
}


