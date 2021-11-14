package com.bernabe.java8.Lambda;

import java.util.function.Supplier;

public class ExampleSupplier {

  public static void main(String[] args) {

    //Supplier only returns value, doesn't accept args
    Supplier<String> writeHello = () -> {
      return "Hello World";
    };
    System.out.println("writeHello.get() = " + writeHello.get());

    //Simplified supplier
    Supplier<String> writeGoodBye = () -> "Good Bye World";
    System.out.println("writeGoodBye.get() = " + writeGoodBye.get());

  }

}
