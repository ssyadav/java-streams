package com.satya.filters;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilters {

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // collect all the even numbers and store those in a list
        // before java 8
        List<Integer> evenNumbers = new ArrayList<>();
        for(Integer number : numbers){
            if(number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println(evenNumbers);

        // using stream
        List<Integer> evenNumbersStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(evenNumbersStream);

        // in single line
        numbers.stream().filter(number -> number % 2 == 0).forEach(System.out::print);

        // using parallel stream
        List<Integer> evenNumbersParallelStream = numbers.parallelStream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println(evenNumbersParallelStream);



    }
}
