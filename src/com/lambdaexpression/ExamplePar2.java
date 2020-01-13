package com.lambdaexpression;

public class ExamplePar2 {

  public static void main(final String[] args) {

    MyFunctionalInterface3 mfi3 = (str1, str2) -> str1 + str2;
    System.out.println(mfi3.sconcat("Hello ", "Harsh"));
  }
}
