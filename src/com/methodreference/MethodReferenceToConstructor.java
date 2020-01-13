package com.methodreference;

@FunctionalInterface
interface MyInterface {

  void display(String say);
}


class Hello {

  public Hello(String say) {

    System.out.println(say);
  }
}


public class MethodReferenceToConstructor {

  public static void main(String[] args) {

    // Method reference to a constructor
    MyInterface ref = Hello::new;
    ref.display("Hello World!");
  }
}
