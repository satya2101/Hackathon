package Programs;

public class RemoveChar {
	public static void main(String[] args) {
		
		String str = "abcdDCBA123";
		String strNew = str.replace("a", "");
		System.out.println(strNew);
	}
}