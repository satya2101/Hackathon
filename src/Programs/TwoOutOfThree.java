package Programs;

public class TwoOutOfThree {

	public static boolean atLeastTwo(boolean a, boolean b, boolean c) {
	    if ((a && b) || (b && c) || (a && c)) {
	        System.out.println("true");
	        return true;
	    }
	    else{
	       System.out.println(" false");
	       return false;
	    }
	}
	public static void main(String[] args) {
		
		TwoOutOfThree.atLeastTwo(true,false,true);
		
	}

}
