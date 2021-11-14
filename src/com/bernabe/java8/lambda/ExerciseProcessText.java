package com.bernabe.java8.lambda;

import com.bernabe.java8.lambda.custom.ProcessText;

public class ExerciseProcessText {

  public static void main(String[] args) {
    String text = "Hello, world.  ";
    ProcessText processText = a -> a.replace(" ", "").replace(".", "").replace(",", "");
    System.out.println("processText.process(text) = " + processText.process(text));
  }
}
