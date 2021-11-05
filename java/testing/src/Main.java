
import java.util.*;

import com.project.helper.*;
import com.project.lecture.*;
import com.project.student.*;
import com.project.register.*;

class Main {
  public static void main(String[] args) {

    List<Double> grades1 = Helper.generateRandomList(10.0, 500.0, 4),
                 grades2 = Helper.generateRandomList(10.0, 500.0, 4),
                 grades3 = Helper.generateRandomList(10.0, 500.0, 4);

    Student naughty1 = new NaughtyStudent(grades1, "Naughty 1", Level.YEARONE),
            naughty2 = new NaughtyStudent(grades2, "Naughty 2", Level.YEARTHREE),
            student3 = new Student(grades3, "Student 3", Level.YEARTWO),
            student4 = new Student(grades1, "Student 4", Level.YEARFOUR),
            naughty5 = new NaughtyStudent(grades3, "Naughty 5", Level.YEARTHREE),
            naughty6 = new NaughtyStudent(grades2, "Naughty 6", Level.YEARFOUR);
    
    Lecture lecture = new Lecture();
    lecture.enter(naughty1);
    lecture.enter(naughty2);
    lecture.enter(student3);
    lecture.enter(student4);
    lecture.enter(naughty5);
    lecture.enter(naughty6);

    ArrayList<Nameable> students = new ArrayList<>();
    students.add(naughty1);
    students.add(naughty2);
    students.add(student3);
    students.add(student4);
    students.add(naughty5);
    students.add(naughty6);

    Register register = new Register(students);

    System.out.println(register.printReport());
  }
}