package com.methodreference;

@FunctionalInterface
interface InstanceMethod {

  void display();
}


public class MethodReferenceToInstanceMethodOfAnObject {

  public void MyMethod() {

    System.out.println("Instance Method");
  }

  public static void main(final String[] args) {

    MethodReferenceToInstanceMethodOfAnObject m = new MethodReferenceToInstanceMethodOfAnObject();
    // method reference using the object of the class
    InstanceMethod im = m::MyMethod;
    // calling the method of functional interface
    im.display();
  }
}
