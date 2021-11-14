package com.bernabe.java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.bernabe.java8.lambda.model.User;

public class ExampleConsumer {

  public static void main(String[] args) {

    // consumer
    Consumer<Date> dateFormatterConsumer = date -> {
      SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
      System.out.println("date = " + dateFormat.format(date));
    };
    dateFormatterConsumer.accept(new Date());

    // biconsumer
    BiConsumer<Integer, Integer> addNums = (a, b) -> {
      System.out.println("a + b = " + (a + b));
    };
    addNums.accept(3, 5);

    // foreach with consumer
    Consumer<String> writeConsumer = System.out::println;
    writeConsumer.accept("The Beatles");
    List<String> names = Arrays.asList("John", "Paul", "George", "Ringo");
    names.forEach(writeConsumer);

    // biconsumer
    BiConsumer<User, String> setFormattedName = (user, name) -> {
      user.setName(name.toUpperCase(Locale.ROOT));
    };
    User beatle = new User();
    setFormattedName.accept(beatle, "ringo");
    System.out.println("beatle = " + beatle.getName());

    // biconsumer simplified
    BiConsumer<User, String> setFormattedName2 = User::setName;
    User stone = new User();
    setFormattedName2.accept(stone, "charlie");
    System.out.println("stone = " + stone.getName());

  }

}
