package ru.sapteh;

import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("список");
        list.add("используя");
        list.add("сдержимое");
        list.add("на");
        list.add("экран");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.size());

    }
}
