package com.methodreference;

import java.util.function.BiFunction;

class Multiplication {

  public static int multiply(final int a, final int b) {

    return a * b;
  }
}


public class MethodReferenceToStaticMethodOfClass {

  public static void main(final String[] args) {

    BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;
    int prod = product.apply(5, 6);
    System.out.println("Required product is : " + prod);
  }
}
