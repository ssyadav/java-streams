package com.satya.maps;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringLengthUsingMap {

    public static void main(String[] args){
        // create a list of strings
        List<String> list = Arrays.asList("bus", "Train", "car", "bike", "cycle");

        // using stream map to find the length of each string and store in a list
        List<Integer> strWithLength = list.stream().map(str -> str.length()).collect(Collectors.toList());
        // print the list
        strWithLength.forEach(System.out::println);

        // simplify it
        list.stream().map(String::length).collect(Collectors.toList()).forEach(System.out::println);
        // further simplify it
        list.stream().map(String::length).forEach(System.out::println);
    }


}
