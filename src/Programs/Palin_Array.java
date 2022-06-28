package Programs;

public class Palin_Array {
	
		public int isPalindrome(int[] array) {
			   int length = array.length;
			   for (int index = 0; index < array.length; index++) {
				int start = array[index];
				int end = array[--length];
				if (length< index) {
					break;
				}
				if (start != end) {
					System.out.println("given array is not palindrome");

					return 1;
				}
			   }
				System.out.println("given array is palindrome");

			   return 1;
			}
		public static void main(String[] args) {
			
			Palin_Array pp=new Palin_Array();
			int Arr[]={2,0,8,0,6,3,5,3,6,0,8,0,2};
			pp.isPalindrome(Arr);
			
	}

}
