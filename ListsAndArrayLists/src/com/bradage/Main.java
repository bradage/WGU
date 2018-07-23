package com.bradage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washingotn");

        System.out.println(list);

        list.add("Alaska");

        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state = list.get(1);
        System.out.println("The second state is " + state);

        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at psotiion " + pos);

    }
}
