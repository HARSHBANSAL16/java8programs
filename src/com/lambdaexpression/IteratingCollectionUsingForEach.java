package com.lambdaexpression;

import java.util.ArrayList;
import java.util.List;

public class IteratingCollectionUsingForEach {

  public static void main(final String[] args) {

    List<String> list = new ArrayList<String>();
    list.add("Harsh");
    list.add("Harsh2");
    list.add("Harsh3");
    list.add("Harsh4");
    list.add("Harsh5");
    list.add("Harsh6");
    list.forEach(
        // lambda expressions
        item -> System.out.println(item));
  }
}
