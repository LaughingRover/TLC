package com.project.student;

import java.util.*;


public class Bag <T> {
  List<T> content = new ArrayList<>();

  public void add(T student) { content.add(student);}

  public void remove(T student) { content.remove(student);}
  
  public void clear() { content.clear();}
}