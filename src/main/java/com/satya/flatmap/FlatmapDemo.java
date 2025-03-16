package com.satya.flatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo {
  public static void main(String[] args) {
    // map example
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
    final List<Integer> integers = list.stream().map(i -> i + 10).toList();
    //        integers.forEach(System.out::println);

    // flatmap example
    List<List<Integer>> listOfList =
        Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(7, 8, 9));

    final List<Integer> integers1 = listOfList.stream().flatMap(Collection::stream).toList();
    System.out.println(integers1);

    // flatmap example with map
      // add 10 to each element of the list and then flatmap it
    List<Integer> integers2 = listOfList.stream()
            .flatMap(Collection::stream) // return Stream<List<Integer>> to Stream<Integer>
            .map(j -> j + 10) // adds 10 to each element of Stream<Integer> and return Stream<Integer>
            .toList();
    System.out.println(integers2);
  }
}
