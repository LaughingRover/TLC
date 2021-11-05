package com.project.register;

import java.util.*;
import java.util.stream.*;

import com.project.student.*;

public class Register {
  private List<Nameable> register;
  private List<Student> studentsByLevel;
  
  public Register(List<Nameable> students) {
    register = students;
  }

  public List<String> getRegister() {
    return register
      .stream()
      .map(student -> student.getName())
      .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
  }



   public List<String> getRegisterByLevel(Level level) {
     return register
       .stream()
         .filter(student -> student.getLevel() == level)
         .map(student -> student.getName())
         .collect(Collectors.toList());
         // .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
   }

//  public Map<Level, List<Student>> getRegisterByLevel() {
//    Map<Level, List<Student>> studentsProfile;
//
//    register
//      .stream()
//      .forEach(student -> {
//        if (studentsProfile.get(student.getLevel()) == (null)) {
//          studentsByLevel = new ArrayList<>();
//          studentsByLevel.add(student);
//          studentsProfile.put(student.getLevel(), studentsByLevel);
//        } else {
//          studentsProfile.get(student.getLevel()).add(student);
//        }
//      });
//    return studentsProfile;
//  }


  // public List<String> sort(Comparator<Student> comparator) { 

  //   return register
  //     .stream()
  //     .sorted(comparator)
  //     .toList();
  // }

  public String printReport() {
    StringBuilder sb = new StringBuilder();

    Level[] levels = Level.values();

    for(Level item : levels) {
      sb.append("\n\n\t"+item);
      sb.append("\n================\n");
      
      List<String> filtered = getRegisterByLevel(item);

      for(String name : filtered) {
        sb.append(name);
        sb.append("\n");
      }
    }

    return sb.toString();
  }
}