package com.ganesh.collection;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @created: 14/04/2021 - 8:42 PM
 * @author: Ganesh
 */


public class MapMain {

    public static void main(String[] args) {

        HashMap countries = new HashMap();
        HashMap<Integer, String> countries2 = new HashMap<>();
        Map languages = new HashMap();
        Map<String, String> languages2 = new HashMap<>();

        countries2.put(840, "USA");
        countries2.put(484, "MEX");
        countries2.put(124, "CAN");

        System.out.println(countries2.get(840));

        countries2.remove(840);
        countries2.keySet();

        countries2.put(125, "CAN");
        countries2.put(125, "ACE");
        // Here ACE override By CAN bcz Both have same keys

        countries2.values();

        // Map provides two conditional methods which returns T/F

        countries2.containsKey(484);
        countries2.containsValue("USA");

        countries2.put(-1, null);
        countries2.put(null, null);


        TreeMap<Integer, String> planats = new TreeMap<>();
        Map<String, String> englishSpanish = new TreeMap<>();

        planats.put(1, "Earth");
        planats.put(2, "Venus");
        planats.put(3, "Moon");
        System.out.println(planats.keySet().toString());
        System.out.println(planats.values().toString());

        englishSpanish.put("cat", "Mew Mew");
        englishSpanish.put("dog", "Boww Boww");
        englishSpanish.put("rat", "Tu tu");

        System.out.println(englishSpanish.keySet().toString());
        System.out.println(englishSpanish.values().toString());
    }
}
