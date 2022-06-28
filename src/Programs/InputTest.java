package Programs;

//Q23. WJP TO DIFFERENTIATE INPUT AS STRING, INT OR BOOL

public class InputTest {
	
	void printType(String x)
	{
		System.out.println(x+" is a string");
	}
	void printType(int x)
	{
		System.out.println(x+" is an integer");
	}
	void printType(boolean x)
	{
		System.out.println(x+" is a boolean");
	}


	public static void main(String[]args)
	{
		/*Object val;
		Scanner ss=new Scanner(System.in);
		System.out.println("enter a value");
		val=ss;*/
		InputTest t=new InputTest();
		t.printType(true);
	}
}
		
		
		/*	Object val;
			Scanner s=new Scanner(System.in);
			System.out.println("enter a value");
			int k=s.nextInt();
			if(k=s.equals(val))				
			{
				
			}
			
			try{
			if(	(boolean) (val=s.nextInt()))
			{
				System.out.println("you entered integer");
				System.out.println("you entered boolean");
				System.out.println("you entered String");
			}
				val=s.next();
				val=s.nextBoolean();
				}
			catch(InputMismatchException e){
				System.out.println("enter either integer,string or boolean");
				*/
		
			
	


