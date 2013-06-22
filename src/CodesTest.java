import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import CodeExamples.*;
/********
Joel 
Jun 19, 2013
 ********/

public class CodesTest {
	
	private int[] inputArray;
	
	public void setInput(int [] givenIP){
		this.inputArray= new int[givenIP.length];
		for(int i=0; i<givenIP.length;i++)
		{ inputArray[i] = givenIP[i];}
	}
	
	public int[] getInput(){
		return this.inputArray;
	}
	
	// The input to be valid, it shoudl atleast have 1 element
	public boolean isValidArr(int[] givenArr){
		
		if(givenArr==null)
		{return false;}
		
		if(givenArr.length < 1)
		{return false;}
		
		return true;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		CodesTest o_tc = new CodesTest();
		
		int [] arr = {1,-2,-3,-4,-5,2,3,4,5};
		
		// Count Distinct Absolute Value
		if(new CodesTest().isValidArr(arr))
		{System.out.println("Distint Abs Value in arr is " + new CountDistinctABSValue().getOutput(arr)); }
		else{System.out.println("The input is invalid.");}
		System.out.println("*******************************************************************");
		System.out.println("");
		
		// Find the Equilibrium
		int equi[] = {-7,1,5,2,-4,3,0};
		if(new CodesTest().isValidArr(equi))
		{System.out.println("Equlibrium in the given array is " + new FindEquilibrium().findEquilibrium(equi, equi.length));}
		else{System.out.println("The input is invalid.");}
		System.out.println("*******************************************************************");
		System.out.println("");
		
		// Find the Sum of Pairs which result in Even Number
		int sumOfEvenPairs[] =  {-7,1,5,2,-4,3,0,2,5,6,7,4,5,6};
		if(new CodesTest().isValidArr(sumOfEvenPairs))
		{System.out.println("The Sum of Pairs which result in Even Number are " + new SumOfEvenPairs().getNumOfEvenPairs(sumOfEvenPairs));}
		else{System.out.println("The input is invalid.");}
		System.out.println("*******************************************************************");
		System.out.println("");
		
		// Find the Dominator in the Given Array
		int givenDomArr[] = {-7,1,5,2,-4,3,0,2,5,6,7,4,5,6};
		if(new CodesTest().isValidArr(givenDomArr))
		{System.out.println("The the Dominator in the Given Array is  " + new Dominator().getDominator(givenDomArr));}
		else{System.out.println("The input is invalid.");}
		System.out.println("*******************************************************************");
		System.out.println("");
				
				
		// Find the  Longest Binary Gap
		int aBinaryGapArr = 1041;
		System.out.println("The longest Binary Gap for the Number is " + new BinaryGap().getBinaryGap(aBinaryGapArr));
		System.out.println("*******************************************************************");
		System.out.println("");
		
	}
	 
}
