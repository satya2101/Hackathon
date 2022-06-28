package Programs;

public class Addition {

		//Q34. WRITE A METHOD TO IMPLEMENT *, - , / OPERATIONS. YOU SHOULD USE ONLY THE + OPERATOR
		
	int Add(int a, int b)
	{
		int c=a+b;
		return c;
	}
		
	public static void main(String[] args) {
		
		Addition a=new Addition();
		int t=a.Add(20, 30);
		System.out.println(t);
	}

}
