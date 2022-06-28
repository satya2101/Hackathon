package Programs;

public class Unique_word {

	
	
	  public static void main(String []args) {
	    String str="welcome to the computer world welcome";
	    String words[]=str.split(" ");            
	    int count=0;
	    for(int i=0;i<words.length;i++)
	    {  if(words[i].equals("") || words[i].equals(" "))
	          {                      
	            continue; 
	          }
	       else {                  
	              for(int j=i+1;j<words.length;j++)
	              {
	                if(words[i].equals(words[j]))
	                 { 
	                   count=1;
	                   words[j]=" ";
	                   break;
	                 }
	              }
	              if(count==0)
	              {
	               System.out.print(words[i]+" ");
	              }
	              count=0;     
	            }
	    }
	  }
	}

