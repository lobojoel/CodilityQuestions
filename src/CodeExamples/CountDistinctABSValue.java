/********
Joel 
Jun 22, 2013
********/

package CodeExamples;

import java.util.HashSet;

public class CountDistinctABSValue {

	public int count;
	
	public CountDistinctABSValue() {
		// TODO Auto-generated constructor stub
	count = 0;
	}
	
	// COUNT DISTINCT ABS VALUES
	public int getOutput(int [] givenInput)
	{
		if(givenInput == null)
		{System.out.println("Please Enter some variables Sir."); return -1;}
		
		if(givenInput.length<1)
		{System.out.println("Please Enter some variables Sir."); return -1; }
		
		if(givenInput.length < 2)
		{count+=1; return count;}
		
		HashSet<Integer> o_hs = new HashSet<Integer>();
		for(int numCount=0; numCount<givenInput.length;numCount++)
		{			
			if(o_hs.add(Math.abs(givenInput[numCount])))
			{count+=1;}
		}
		
		return count;
		
	}
}
