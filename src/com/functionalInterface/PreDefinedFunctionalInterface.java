package com.functionalInterface;

import java.util.function.IntBinaryOperator;

public class PreDefinedFunctionalInterface {

  public static void main(String[] args) {

    // lambda expression
    IntBinaryOperator sum = (a, b) -> a + b;
    System.out.println("Result : " + sum.applyAsInt(5, 7));
  }
}
