/********
Joel 
Jun 22, 2013
********/

package CodeExamples;

public class BinaryGap {

	 // BINARY GAP
	  public int getBinaryGap(int number)
	  {
		  int previous = 0;
		  int current = 0;
		  int longest = 0;
		  
		  if(number<0)
		  {System.out.println("Please Enter a positive number."); return 0;}
		  		  
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
			  
		  return Math.max(current, longest);
	  }
}
