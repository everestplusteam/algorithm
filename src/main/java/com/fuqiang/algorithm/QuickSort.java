package com.fuqiang.algorithm;

public class QuickSort {

  public static void sort(int[] input) {
    sort(input, 0, input.length - 1);
  }

  public static void sort(int[] input, int l, int r) {
    if (l < r) {
      int pivot = partion(input, l, r);
      sort(input, l, pivot - 1);
      sort(input, pivot + 1, r);
    }
  }

  private static int partion(int[] input, int start, int end) {
    int tmp = input[start];
    while (start < end) {
      while (start < end && input[end] > tmp) {
        end--;
      }
      input[start++] = input[end];
      while (start < end && input[start] < tmp) {
        start++;
      }
      input[end--] = input[start];
    }
    input[start] = tmp;
    return start;
  }
}
