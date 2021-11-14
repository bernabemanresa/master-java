package com.bernabe.java8.lambda;

import java.util.function.BiFunction;

import com.bernabe.java8.lambda.custom.Arithmetic;
import com.bernabe.java8.lambda.custom.Calc;

public class ExampleCustomFunctional {

  public static void main(String[] args) {
    Arithmetic add = (a, b) -> a + b;
    Arithmetic subs = (a, b) -> a - b;

    // With custom compute
    Calc calc = new Calc();
    System.out.println("calc.compute(2,3,add) = " + calc.compute(2, 3, add));
    System.out.println("calc.compute(2,2,subs) = " + calc.compute(2, 3, subs));
    System.out.println(
        "calc.compute(2, 3, (a, b) -> a * b) = " + calc.compute(2, 3, (a, b) -> a * b));


    // With custom compute
    System.out.println(
        "calc.computeWithBiFunction(2, 3, (a, b) -> a + b) = " + calc.computeWithBiFunction(2, 3,
            (a, b) -> a + b));
    System.out.println(
        "calc.computeWithBiFunction(2, 3, (a, b) -> a - b) = " + calc.computeWithBiFunction(2, 3,
            (a, b) -> a - b));
    System.out.println(
        "calc.computeWithBiFunction(2, 3, (a, b) -> a * b) = " + calc.computeWithBiFunction(2, 3,
            (a, b) -> a * b));


  }
}
