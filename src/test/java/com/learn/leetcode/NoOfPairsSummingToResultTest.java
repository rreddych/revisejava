package com.learn.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoOfPairsSummingToResultTest {

	@Test
	void testNumOfPairsSummingToResult() {
		int numOfPairs = 0;
		NoOfPairsSummingToResult noOfPairsSummingToResult = new NoOfPairsSummingToResult();
		numOfPairs = noOfPairsSummingToResult.getNoOfPairsSummingToResult(new int[] {1,5,7,3,6,2,9,-1}, 8);
		assertEquals(4, numOfPairs);
		
		numOfPairs = noOfPairsSummingToResult.getNoOfPairsSummingToResult(new int[] {1,5,7,-1}, 6);
		assertEquals(2, numOfPairs);
	}


}
