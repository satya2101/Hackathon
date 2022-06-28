package Programs;

import java.util.HashMap;

public class UniqueEle {
	
	public static void main(String args[])   
    { 
        int arrayWithDuplicates[] = { 10, 3, 5, 3, 9, 22, 4, 3, 1, 5, 6 };  
        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
        for (int j = 0; j < arrayWithDuplicates.length; j++)
        {   
            hashmap.put(arrayWithDuplicates[j], j);   
                
        }
        
        System.out.println("Duplicates are");
        for(int in = 0; in < arrayWithDuplicates.length; in++)
        {  
        	
            for(int k = in + 1; k < arrayWithDuplicates.length; k++)
            {  
                if(arrayWithDuplicates[in] == arrayWithDuplicates[k])  
                System.out.println(arrayWithDuplicates[k]);
                	
            }
        }
        System.out.println("unique elements are"+hashmap.keySet());
    }
}

