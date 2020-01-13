package com.lambdaexpression;

public class ExamplePar1 {

  public static void main(final String[] args) {

    MyFunctionalInterface2 mfi2 = num -> num + 5;
    System.out.println(mfi2.incrementByFive(5));
  }
}
