package com.fuqiang.algorithm;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTest {

  @Test
  public void test() {
		int[] input = {3, 2, 6, 1, 9, 7, 4, 8, 2, 6 };
		QuickSort.sort(input);
		System.out.println(Arrays.toString(input));
  }
}
