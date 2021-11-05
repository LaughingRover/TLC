package com.project.helper;

import java.util.*;
import java.util.stream.*;

public class Helper {

  public static final Random rand = new  Random();

  public static List<Double> generateRandomList(double min, double max, int limit) {
    return DoubleStream
      .generate(rand::nextDouble)
      .limit(limit > 0 ? limit : 4)
      .map(i -> Math.round(min + (max - min) * i) * 10.0 / 100.0)
      .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
  }
}