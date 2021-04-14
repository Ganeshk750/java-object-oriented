package com.ganesh.collection;


/**
 * @created: 14/04/2021 - 10:10 PM
 * @author: Ganesh
 */


public class Widget<T> {

    public static void main(String[] args) {
        Widget<String> widget = new Widget<>();
        widget.setType("Hello");
        Widget widget1 = new Widget<>();
        Widget widget2 = new Widget();

        String[] strings = new String[]{"Hi", "There"};
        System.out.println(Widget.firstArrayElement(strings));
    }

    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static <T> T firstArrayElement(T[] t){
        if(t.length > 0){
            return t[0];
        }
        return null;
    }
}
