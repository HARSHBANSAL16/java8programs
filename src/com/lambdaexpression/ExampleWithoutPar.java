package com.lambdaexpression;

public class ExampleWithoutPar {

  public static void main(final String args[]) {

    // lambda expression
    MyFunctionalInterface1 msg = () -> {
      return "Hello";
    };
    System.out.println(msg.sayHello());
  }
}
