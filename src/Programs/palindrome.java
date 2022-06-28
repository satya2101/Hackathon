package Programs;

public class palindrome {

	public static void main(String[] args) {
		String s="MALAYALAM";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s))
		{
			System.out.println("string is palindrome");
		}
		else{
			System.out.println("string is not palindrome");
		}
	}
}
