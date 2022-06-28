package Programs;

import java.util.ArrayList;
import java.util.Collections;


public class Circus implements Comparable<Circus>{
    int ht;
    int wt;
    
    Circus(int h,int w)
    {
        ht = h;
        wt = w;
    }   
    @Override
    public int compareTo(Circus o) {
    
        if(this.ht == o.ht)
        {
            if(this.wt == o.wt)
            {
                 return 0;
            }
            else
                return this.wt>o.wt?1:-1;
            
        }
        else
        {
            return this.ht>o.ht?1:-1;
        }
        
    }

    @Override
    public String toString() {
        return "("+ht+","+wt+")";
    }
    
    static int findMaxSeqLength(int[] wts)
    {
        int fitlength = 0;
        int maxseqlength = 0;
   for(int i =1;i<wts.length;i++)
    {
        
        if(wts[i]>wts[i-1])
        {
            if((i-1)==0 || i==wts.length-1)
            fitlength+=1;
            fitlength++;
        }
        else 
        {
            fitlength = 0;
        }
        if(fitlength>maxseqlength)
                maxseqlength = fitlength;
    }
    
    return maxseqlength;
    }

public static void main(String args[])
{
    
    ArrayList<Integer> maxSeqLengths = new ArrayList<Integer>();
    
    Circus obj1 = new Circus(56,90);
    Circus obj2 = new Circus(60,95);
    Circus obj3 = new Circus(65,100);
    Circus obj4 = new Circus(68,110);
    Circus obj5 = new Circus(70,150);
    Circus obj6 = new Circus(75,190);
    
    ArrayList<Circus> mylist = new ArrayList<>();
    mylist.add(obj1);
    mylist.add(obj2);
    mylist.add(obj3);
    mylist.add(obj4);
    mylist.add(obj5);
    mylist.add(obj6);
    Collections.sort(mylist);
   int[] wts = new int[mylist.size()];
   int j = 0;
    for(Circus i:mylist)
    {
        System.out.println(i);
        wts[j++] = i.wt;
    }
   int maxseqlength = findMaxSeqLength(wts);
    System.out.println("length="+maxseqlength);
    
    
}
        
}