package com.bernabe.java8.lambda.custom;

import java.util.function.BiFunction;

public class Calc{


  public double compute(double a, double b, Arithmetic lambda) {
    return lambda.operation(a,b);
  }



  public double computeWithBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda) {
    return lambda.apply(a,b);
  }
}
