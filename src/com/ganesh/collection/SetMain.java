package com.ganesh.collection;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @created: 14/04/2021 - 8:23 PM
 * @author: Ganesh
 */


public class SetMain {
    public static void main(String[] args) {
//        HashSet<Integer> primeNumber1 = new HashSet<>();
//        TreeSet<Integer> primeNumber2 = new TreeSet<>();

        Set<Integer> primeNumber1 = new HashSet<>();
        Set<Integer> primeNumber2 = new TreeSet<>();

        primeNumber1.add(71);
        primeNumber1.add(61);
        primeNumber1.add(41);
        primeNumber1.add(1);

        primeNumber2.add(71);
        primeNumber2.add(61);
        primeNumber2.add(41);
        primeNumber2.add(1);

        primeNumber1.forEach(System.out::println);
        System.out.println("");
        primeNumber2.forEach(System.out::println);
        System.out.println(primeNumber1.add(5));
        System.out.println(primeNumber1.add(5));

    }
}
