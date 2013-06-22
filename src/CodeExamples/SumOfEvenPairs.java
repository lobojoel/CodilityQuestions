/********
Joel 
Jun 22, 2013
********/

package CodeExamples;

public class SumOfEvenPairs {

	 // SUM OF Even Pairs in an Array
	  public int getNumOfEvenPairs(int[] givenArr)
	  {
		  if (givenArr == null || givenArr.length < 2) {
			  return 0;
			}

			int evenNumbersCount = 0;
			int oddNumberCount = 0;

			for (int nelement : givenArr) {
			  if (nelement % 2 == 0) {
			    evenNumbersCount++;
			  } else {
			    oddNumberCount++;
			  }
			}

			int nTotal = (evenNumbersCount * (evenNumbersCount - 1)) / 2 + (oddNumberCount * (oddNumberCount - 1)) / 2;
			return nTotal > 1e6 ? -1 : nTotal;  
	  }
}
