package com.satya.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapWithObject {
  public static void main(String[] args) {
    List<List<Student>> students =
        Arrays.asList(
            Arrays.asList(new Student("Scott", 101, 'A'), new Student("David", 102, 'B')),
            Arrays.asList(new Student("Mary", 103, 'C'), new Student("Luna", 104, 'A')),
            Arrays.asList(new Student("Ken", 105, 'B'), new Student("Jony", 106, 'C')));

    // before java 8 - to print the name of the students
    for (List<Student> innerList : students) {
      for (Student student : innerList) {
        System.out.println(student.name);
      }
    }

    System.out.println("==============Using flatmap java 8==============");
    // using flatmap java 8
    final List<String> collect =
        students.stream()
            .flatMap(innerList -> innerList.stream())
            .map(student -> student.name)
            .collect(Collectors.toList());

    System.out.println(collect);

    System.out.println("==============Using flatmap java 8 - simplified==============");
    // simplify it
    students.stream().flatMap(List::stream).map(s -> s.name).forEach(System.out::println);
  }
}

class Student {
  String name;
  int sid;
  char grade;

  public Student(String name, int sid, char grade) {
    this.name = name;
    this.sid = sid;
    this.grade = grade;
  }
}
