package com.bernabe.recursion.model;

import java.util.ArrayList;
import java.util.List;

public class Component {

  private String name;
  private int level;
  private List<Component> children;

  public Component(String name) {
    this.name = name;
    this.children = new ArrayList<>();
  }

  public Component addChildren(Component c) {
    this.children.add(c);
    return this;
  }

  public boolean hasChildren() {
    return !this.children.isEmpty();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Component> getChildren() {
    return children;
  }

  public void setChildren(List<Component> children) {
    this.children = children;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }
}
