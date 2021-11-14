package com.bernabe.java8.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ExamplePredicate {

  public static void main(String[] args) {

    Predicate<Integer> test = num -> num > 10;
    System.out.println("test.test(9) = " + test.test(9));
    System.out.println("test.test(11) = " + test.test(11));

    BiPredicate<String, Integer> test2 = (a,b) -> a.trim().length() == b;
    System.out.println("test2.test(\"Ringo\"), 3 = " + test2.test("Ringo", 3));
    System.out.println("test2.test(\"Ringo\"), 5 = " + test2.test("Ringo", 5));


  }

}
