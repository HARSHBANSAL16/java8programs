package com.methodreference;

import java.util.Arrays;

public class MethodReference {

  public static void main(final String[] args) {

    String[] names = {"Harsh", "Rajat", "Mohit", "Saurav"};
    /*
     * Method reference to an instance method of an arbitrary object of a particular type
     */
    Arrays.sort(names, String::compareToIgnoreCase);
    for (String str : names) {
      System.out.println(str);
    }
  }
}
