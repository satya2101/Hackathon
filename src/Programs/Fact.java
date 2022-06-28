package Programs;

public class Fact {

	public static void main(String[] args) {
	//Q2. write a program to find factorial (Non Recursive)

		
		int fact=1;
		 int no=6;
		 for (int i = no; i >=1; i--)
		 {
			 fact=fact*i;
			
		}
		 System.out.println(fact);
	}

}
