package com.satya.flatmap;


import java.util.Arrays;
import java.util.List;

public class FlatmapDemo2 {

    public static void main(String[] args){

        List<List<String>> list = Arrays.asList(
            Arrays.asList("scott", "david", "john"),
            Arrays.asList("mary", "luna", "tom"),
            Arrays.asList("ken", "jony", "kitty")
        );

        // before java 8
        /*for(List<String> innerList : list) {
            for (String name : innerList) {
                System.out.println(name);
            }
        }*/

        // using flatmap java 8
        list.stream()
            .flatMap(innerList -> innerList.stream())
            .forEach(System.out::println);

        // simplify it
        list.stream()
            .flatMap(List::stream)
            .forEach(System.out::println);
    }
}
