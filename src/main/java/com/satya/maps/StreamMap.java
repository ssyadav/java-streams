package com.satya.maps;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args){

        // create a list of strings
        List<String> list = Arrays.asList("bus", "Train", "car", "bike", "cycle");

        // using stream map to convert all strings to uppercase
        list.stream().map(str -> str.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
        // simplify it
        list.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
        // further simplify it
        list.stream().map(String::toUpperCase).forEach(System.out::println);

    }
}
