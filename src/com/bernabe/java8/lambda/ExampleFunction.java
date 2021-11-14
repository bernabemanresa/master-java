package com.bernabe.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ExampleFunction {

  public static void main(String[] args) {
    //Function
    Function<String, String> salute = param -> " Hello, " + param;
    String helloRingo = salute.apply("Ringo");
    System.out.println(helloRingo);


    //Simplified Function
    Function<String,String> toUpperText = String::toString;
    System.out.println("toUpperText.apply(\"ringo\") = " + toUpperText.apply("ringo"));

    //Bifunction
    BiFunction<String, String, String> formatName = (a,b) -> {
      return a + " " + b; 
    };
    System.out.println("formatName.apply(\"Ringo\", \"Star\") = " + formatName.apply("Ringo", "Star"));

    //Simplified Bifunction
    BiFunction<Integer, Integer, Double> power = Math::pow;
    System.out.println("operate.apply(2,3) = " + power.apply(2,3));

  }

}
