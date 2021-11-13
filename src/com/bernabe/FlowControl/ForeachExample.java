package com.bernabe.FlowControl;

public class ForeachExample {

  public static void main(String[] args) {
    int[] nums = {1, 3, 5, 7, 9, 11, 13, 15};
    for (int num : nums) {
      System.out.println("num = " + num);
    }

    String[] names = {"Jpah", "Paul", "Ringo", "Georde"};
    for (String name : names) {
      System.out.println("name = " + name);
    }
  }

}
