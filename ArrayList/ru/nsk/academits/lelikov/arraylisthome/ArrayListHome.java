package ru.nsk.academits.lelikov.arraylisthome;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListHome {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(new FileInputStream("input.txt"));
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        scanner.close();

        System.out.println("Перенос строк файла в список");
        System.out.println(list);
        System.out.println();

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        System.out.println("Список до удаления четных чисел");
        System.out.println(list2);

        deleteEven(list2);

        System.out.println("Список после удаления четных чисел");
        System.out.println(list2);
        System.out.println();

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(5);
        list3.add(2);
        list3.add(1);
        list3.add(3);
        list3.add(5);

        System.out.println("Список с повторяющимися элементами");
        System.out.println(list3);
        ArrayList<Integer> list4 = deleteDuplicates(list3);
        System.out.println("Список без повторяющихся элементов");
        System.out.println(list4);
    }

    private static ArrayList<Integer> deleteDuplicates(List<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();

        for (Integer s : list) {
            if (!(newList.contains(s))) {
                newList.add(s);
            }
        }
        return new ArrayList<>(newList);
    }

    private static void deleteEven(ArrayList<Integer> list) {
        Iterator<Integer> iterator;
        for (iterator = list.iterator(); iterator.hasNext(); ) {
            Integer even = iterator.next();
            if (even % 2 == 0) {
                iterator.remove();
            }
        }
    }
}