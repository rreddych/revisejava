package com.learn.others;

public class NoOfPairsSummingToResult {

	public int getNoOfPairsSummingToResult(int[] intArray, int result) {
		//Given an array of integers and a sum , 
		//find the number of pairs whose sum is equal to sum 
		//Example : Input : array = {1,5,7,-1} and sum = 6   output : 2
		int numOfPairs = 0;
		for(int i=0; i<intArray.length; i++) {
			for(int j=i+1; j<intArray.length; j++) {
				if(intArray[i]+intArray[j] == result) 
					numOfPairs++;
			}
		}
		return numOfPairs;
	}
}