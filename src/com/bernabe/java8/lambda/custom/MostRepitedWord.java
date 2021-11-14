package com.bernabe.java8.lambda.custom;

import java.util.Map;

@FunctionalInterface
public interface MostRepitedWord {

  Map<String, Integer> process(String word);
}
