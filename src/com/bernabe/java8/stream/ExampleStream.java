package com.bernabe.java8.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ExampleStream {

  public static void main(String[] args) {
    // Initialize Stream with Stream.of
    Stream<String> names = Stream.of("John", "Paul", "Ringo", "George");
    names.forEach(System.out::println);

    // Initialize Stream with Arrays.stream
    String[] beatles = {"John", "Paul", "Ringo", "George"};
    Stream<String> band = Arrays.stream(beatles);
    band.forEach(System.out::println);

  }

}
