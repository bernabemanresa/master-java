package com.bernabe.recursion;

import java.util.stream.Stream;

import com.bernabe.recursion.model.Component;

public class RecursionExample {

  public static void main(String[] args) {
    Component users = new Component("Users");
    Component publicUsers = new Component("Public Users");
    Component adminUsers = new Component("Admins");
    Component root = new Component("root");
    Component admin = new Component("admin");
    Component paul = new Component("Paul");
    Component ringo = new Component("Ringo");

    users.addChildren(publicUsers);
    users.addChildren(adminUsers);
    publicUsers.addChildren(paul);
    publicUsers.addChildren(ringo);
    adminUsers.addChildren(root);
    adminUsers.addChildren(admin);

    recurseJava6LoadTree(users, 0);
    recurseJava8LoadTree(users, 0).forEach(c -> System.out.println("\t".repeat(c.getLevel()) + c.getName()));

  }

  public static void recurseJava6LoadTree(Component c, int level) {
    System.out.println("\t".repeat(level) + c.getName());
    if (c.hasChildren()) {
      for (Component child : c.getChildren()) {
        recurseJava6LoadTree(child, level + 1);
      }
    }
  }

  public static Stream<Component> recurseJava8LoadTree(Component c, int level) {
    c.setLevel(level);
    return Stream.concat(Stream.of(c),
        c.getChildren().stream().flatMap(children -> recurseJava8LoadTree(children, level + 1)));
  }

}