package ru.vsu.cs.course1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task {
    static LinkedList<Integer> inList1XorInList2(LinkedList<Integer> List1, LinkedList<Integer> List2){
        LinkedList<Integer> List3 = new LinkedList<>();
        for(int i = 0; i<List1.size(); i++) {
            if(indexOf(List2,List1.get(i)) == -1 && !(List3.contains(List1.get(i)))) {
                List3.add(List1.get(i));
            }
        }
        for(int i = 0; i<List2.size(); i++) {
            if(indexOf(List1,List2.get(i)) == -1 && !(List3.contains(List2.get(i)))) {
                List3.add(List2.get(i));
            }
        }
        return List3;
    }
    static int indexOf(LinkedList<Integer> list, int val) {
        return list.indexOf(val);
    }
        public static List<Integer> convertArrayToList(int[] array) {
            List<Integer> list = new ArrayList<>(array.length);
            for (int i = 0; i < array.length; i++) {
                list.add(i, array[i]);
            }
            return list;
        }

        public static int[] convertListToArray(List<Integer> list) {
            int[] array = new int[list.size()];
            for (int i = 0; i < array.length; i++) {
                array[i] = list.get(i);
            }
            return array;
        }
    }
