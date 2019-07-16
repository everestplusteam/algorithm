package com.fuqiang.algorithm;

public class MergeSort {

  public static void sort(int[] input) {
    int[] temp = new int[input.length];
    sort(input, 0, input.length - 1, temp);
  }

  public static void sort(int[] input, int l, int r, int[] temp) {
    int mid = (l + r) / 2;
    System.out.println(l + ":" + r);
    if (l < r) {
      sort(input, l, mid, temp);
      sort(input, mid + 1, r, temp);
      merge(input, l, mid, r, temp);
    }
  }

  private static void merge(int[] input, int l, int mid, int r, int[] temp) {
    int i = l;
    int j = mid + 1;
    int t = 0;
    while (i <= mid && j <= r) {
      if (input[i] < input[j]) {
        temp[t++] = input[i++];
      } else {
        temp[t++] = input[j++];
      }
    }
    while (i <= mid) {
      temp[t++] = input[i++];
    }
    while (j <= r) {
      temp[t++] = input[j++];
    }
    t = 0;
    while (l <= r) {
      input[l++] = temp[t++];
    }
  }
}
