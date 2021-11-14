package com.bernabe.java8.lambda;

import java.util.Collections;
import java.util.Map.Entry;

import com.bernabe.java8.lambda.custom.MostRepitedWord;

public class ExerciseCountRepitedText {

  public static void main(String[] args) {
    String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolo ipsum ipsum.";
    MostRepitedWord mostRepitedWord = a -> {
      String[] words = text.replace(".", "").replace(",", "").split(" ");

      int max = 0;
      String word = "";
      for (int i = 0; i < words.length; i++) {
        int count = 0;
        for (int j = 0; j < words.length; j++) {
          if (words[j].equals(words[i])) {
            count++;
          }
          if (count > max) {
            word = words[j];
            max = count;
          }
        }
      }

      return Collections.singletonMap(word, max);
    };

    Entry<String, Integer> result = mostRepitedWord.process(text).entrySet()
        .iterator().next();
    System.out.println(
        "Most repeated word: '" + result.getKey() + "' " + result.getValue() + " times.");

  }
}
