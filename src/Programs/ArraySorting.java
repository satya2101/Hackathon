package Programs;

public class ArraySorting {

	public static void main(String[] args) {
		
		//Q3. Given an array of integers, sort the integer values
		
		int iArr[]={45,12,01,9,3,33,00,-1};
		for(int i=0;i<iArr.length;i++)
		{
			for(int j=0;j<iArr.length;j++)
			{
				if(iArr[i]<iArr[j])
				{
					int temp=iArr[i];
					iArr[i]=iArr[j];
					iArr[j]=temp;
				}
			}
			
		}
		for(int i=0;i<iArr.length;i++){
		System.out.println(iArr[i]);
		}
		
	}

}
