package com.satya.maps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapWithFilter {

  public static void main(String[] args) {
      List<Employee> employees = Arrays.asList(
              new Employee("John", 2000),
              new Employee("Smith", 3000),
              new Employee("Sam", 5000),
              new Employee("Sara", 8000)
      );

      // using filter - filter all employee salary greater than 3000 and story it in the another list
      List<Integer> salaries = employees.stream()
              .filter(e -> e.salary > 3000)
              .map(e -> e.salary)
              .collect(Collectors.toList());

        // print the list
        salaries.forEach(System.out::println);

        //simplify it
      List<Integer> salariesSimplified = employees.stream()
              .filter(e -> e.salary > 3000)
              .map(e -> e.salary)
              .toList();
      salariesSimplified.forEach(System.out::println);
  }
}

class Employee {
  String name;
  int salary;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }
}
