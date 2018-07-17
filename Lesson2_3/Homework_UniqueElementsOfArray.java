package Lesson2_3;

import java.util.*;

public class Homework_UniqueElementsOfArray {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("b");
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("d");
        arrayList.add("e");
        arrayList.add("f");
        arrayList.add("e");
        arrayList.add("a");
        arrayList.add("g");
        arrayList.add("b");
        arrayList.add("1yt");
        arrayList.add("4fe");
        arrayList.add("6fesg");
        System.out.println(arrayList);
        for (String anArrayList : arrayList)
            map.merge(anArrayList, 1, (a, b) -> a + b);
        System.out.println(map);
    }
}
