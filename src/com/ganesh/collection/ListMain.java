package com.ganesh.collection;


import java.util.*;

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

    }
}
