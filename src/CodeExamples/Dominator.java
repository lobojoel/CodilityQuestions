/********
Joel 
Jun 22, 2013
********/

package CodeExamples;

import java.util.HashMap;
import java.util.Map;

public class Dominator {
	
	 // DENOMINATOR
	  public int getDominator(int[] givenInput){
	       
	        if(givenInput == null)
	        {System.out.println("The object is null"); return -1;}
	       
	        if(givenInput.length<1)
	        {System.out.println("Invalid Data"); return -1;}
	   
	        if(givenInput.length==1)
	        {return 1;}
	       
	        HashMap<Integer, Integer> o_hm = new HashMap<Integer, Integer>();
	        for(int i=0; i<givenInput.length; i++)
	        {
	            if(o_hm.containsKey(givenInput[i]))
	            {o_hm.put(givenInput[i], o_hm.get(givenInput[i])+1);}
	            else
	            {o_hm.put(givenInput[i], 1);}
	        }
	       
	        int dominator = -1;
	        for(Map.Entry<Integer,Integer> entry : o_hm.entrySet() )
	        {
	            if(entry.getValue()>dominator && (entry.getValue()>(givenInput.length/2)))
	            {dominator = (int)entry.getKey(); }              
	        }
	       
	        for(int count=0; count<givenInput.length; count++)
	        {
	            if(givenInput[count]==dominator)
	            { return count; }
	        }
	        return -1;   
	    }

}
