package com.ganesh.collection;


import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @created: 14/04/2021 - 4:56 PM
 * @author: Ganesh
 */


public class ListMain {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList list1 = new ArrayList(100);
        ArrayList list2 = new ArrayList(list1);

        ArrayList<String> colors = new ArrayList<String>();
        List list3 = new ArrayList();
        Collection list4 = new ArrayList();

        colors.add("red");
        colors.add("orange");
        colors.add("blue");
        colors.add("Yellow");

        for (int i = 0; i < colors.size(); i++){
            System.out.println(colors.get(i));
        }
        System.out.println("------------");
        for (String str : colors){
            System.out.println(str);
        }
        System.out.println("------------");
        colors.forEach((ele) -> System.out.println(ele));
        colors.remove("blue");
        colors.remove(1);
        System.out.println("------------");
        colors.forEach((ele) -> System.out.println(ele));

        Object[] objectList = colors.toArray();
        String[] colorArray = colors.toArray(new String[0]);

        String[] shape = new String[]{"Triangle", "RightAngle", "Circle"};
        List shapeList = Arrays.asList(shape);
        System.out.println(shapeList);
        System.out.println(shapeList.getClass().getName());
        System.out.println(colors.getClass().getName());

        List shapeLists = List.of(shapeList);
       // shapeLists.add("Cone"); // it will create immutable list

        List<String> shapeList1 = new ArrayList<>();
        for (String str: shape){
             shapeList1.add("Cone");
        }
        System.out.println(shapeList1);
        Object[] shape2 = shapeList1.toArray();
       // System.out.println(shape2);

        /*---------- LinkedList ----------*/
        LinkedList<String> orders = new LinkedList<String>();
        orders.add("order 1");
        orders.add("order 2");
        orders.add("order 3");
        orders.add("order 4");
        System.out.println(orders);
        orders.addFirst("order 5");
        orders.addLast("order 6");
        System.out.println(orders);
        orders.removeFirst();
        orders.removeLast();
        System.out.println(orders);

        List numberList = new ArrayList();
        numberList.add(10);
        numberList.add(5);
        numberList.add(1);
        numberList.add(3);
        numberList.add(9);
        System.out.println("Before Sorting: "+ numberList);
        Collections.sort(numberList);
        System.out.println("After Sorting: "+ numberList);

        /*===== Comparable =====*/
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Everest", 8848));
        mountains.add(new Mountain("Matterhorn", 4478));
        mountains.add(new Mountain("K2", 8611));
        Collections.sort(mountains);
        System.out.println(mountains.stream()
                .map(Mountain::getName)
                .collect(Collectors.toList()));


        Comparator<Mountain> mountainComparator = new Comparator<Mountain>() {
            @Override
            public int compare(Mountain o1, Mountain o2) {
                return o2.getHeight() - o1.getHeight();
            }
        };

        Collections.sort(mountains, mountainComparator);
        System.out.println(mountains.stream()
                   .map(Mountain::getName)
                   .collect(Collectors.toList()));

    }
}
