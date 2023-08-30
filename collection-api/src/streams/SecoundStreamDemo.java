package streams;

 

import java.util.Arrays;

import java.util.List;

import java.util.stream.Stream;

 

public class SecoundStreamDemo {

    public static void main(String[] args) {

        

        List<String> basket = Arrays.asList("Cherry", "Mango", "Banana", "Pears", "Oranges", "PineApples", "Guava");

        

//        basket.forEach(System.out::println);

        

//        basket.stream().sorted().forEach(System.out::println);

        

//        basket.stream().map(s ->s.toUpperCase()).forEach(System.out::println);

        

//        basket.stream().filter(s -> s.contains("a")).forEach(System.out::println);

        

        System.out.println(basket.stream().filter(s -> s.contains("a")).count());

        

        Stream.of("Jim", "Anna", "Max", "Sam", "Bread", "Joe").sorted().forEach(System.out::println);
        

    }
}