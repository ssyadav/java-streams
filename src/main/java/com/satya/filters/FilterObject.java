package com.satya.filters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterObject {
  public static void main(String[] args) {
    List<Person> people = Arrays.asList(
      new Person("Satya", 38, 10000.0),
      new Person("Sai", 25, 20000.0),
      new Person("Surya", 35, 30000.0),
      new Person("Siva", 40, 40000.0),
      new Person("Sai", 45, 50000.0)
    );

    // collect all the people whose age is greater than 30 and store those in a list
    // before java 8
    List<Person> persons = new ArrayList<>();
    for (Person person : people) {
      if (person.salary > 25000) {
          persons.add(person);
      }
    }
    for (Person person : persons) {
      System.out.println(String.format("Name: %s and Salary: %s", person.name, person.salary));
    }

    System.out.println("================using streams====================");
    // using stream
    List<Person> peopleAbove25KStream = people.stream()
      .filter(person -> person.salary > 25000)
      .toList();
    peopleAbove25KStream.forEach(person -> System.out.println(String.format("Name: %s and Salary: %s", person.name, person.salary)));

    System.out.println("================using streams - single line====================");
    // in single line
    people.stream().filter(person -> person.salary > 25000).forEach(person -> System.out.printf("Name: %s and Salary: %s%n", person.name, person.salary));

    System.out.println("================using parallel streams====================");
    // using parallel stream
    List<Person> peopleAbove25kParallelStream = people.parallelStream()
      .filter(person -> person.salary > 25000)
      .toList();
    peopleAbove25kParallelStream.forEach(person -> System.out.printf("Name: %s and Salary: %s%n", person.name, person.salary));
  }
}

class Person {
  String name;
  int age;
  double salary;

  public Person(String name, int age, double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }
}
