/********
Joel 
Jun 22, 2013

// This code is a reference from "Codility."
********/

package CodeExamples;

public class FindEquilibrium {

	// EQULIBRIUM
	  public int findEquilibrium( int[] arr, int n)
	    {
		  if (n==0)
		  {return -1;}
		  
		  long  sum = 0;
		    int i; 
		    for(i=0;i<n;i++) sum+=(long ) arr[i]; 

		    long  sum_left = 0;    
		    for(i=0;i<n;i++) {
		        long  sum_right = sum - sum_left - (long ) arr[i];
		        if (sum_left == sum_right) return i;
		        sum_left += (long ) arr[i];
		    } 
		    return -1; 
    }
}
