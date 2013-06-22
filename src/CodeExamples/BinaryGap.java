/********
Joel 
Jun 22, 2013
********/

package CodeExamples;

public class BinaryGap {

	 // BINARY GAP
	  public int getBinaryGap(int number)
	  {
		  long previous = 0;
		  long current = 0;
		  long longest = 0;
		  
		  if(number<=0)
		  {System.out.println("RETURN 0"); return 0;}
		  		  
		  do{
			  previous= number & 1;
			  number = number>>1;
	        if(previous==0)
	        {current++;}
	        else{
	        	if(current>longest)
	        	{longest = current;}
	        	current=0;
	        }
		  }while(number>0);
			  
			  return (int)Math.max(current, longest);
	  }
}
