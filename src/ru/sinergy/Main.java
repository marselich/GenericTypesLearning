package ru.sinergy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Object o = new Scanner(System.in);
//        Scanner scanner = null;
//        if(o instanceof Scanner) // проверка на тип данных
//            scanner = (Scanner) o;
//
//        if(scanner != null) {
//            scanner.nextInt();
//        }
//
//        Object o1 = new String();
//        Object o2 = new Integer(14);

        Object[] objects = {10, "Привет", 3.14}; //здесь происходит автоупаковка

        for (Object o : objects) {
            if (o instanceof String) {
                String s = (String) o;
                System.out.println(s);
            }
        }


        ArrayList<Integer> numbers = new ArrayList(); // сохраняет Object

        for (int i = 0; i < 10; i++) {
            numbers.add(i + 10);
//            numbers.add(i + 10.2f);
        }

        int sum = 0;
        for (Integer o : numbers) {
            sum += /*(Integer)*/ o;
        }
        System.out.println(sum);


        // Основной тип<Тип параметра>
        // Основной тип<Тип параметра1, Тип параметра2, Тип параметра3>


        HashMap<Integer, String> map = new HashMap();
        map.put(7, "Привет");
        map.put(12, "Hello");



        ArrayList<String> listHello = new ArrayList();
        listHello.add("привет");
        listHello.add("Hi");

        ArrayList<String> listBye = new ArrayList();
        listHello.add("пока");
        listHello.add("Bye");

        ArrayList<ArrayList<String>> arrayLists = new ArrayList();
        arrayLists.add(listHello);
        arrayLists.add(listBye);

        for(ArrayList<String> item : arrayLists) {
            for(String s: item) {
                System.out.println(s);
            }
        }

    }
}


/*
*          То что делаем мы в коде                            То во что преобразует компилятор
* ArrayList<Integer> list = new ArrayList<Integer>();       ArrayList list = new ArrayList
* list.add(1);                                              list.add((Integer) 1);
* int x = list.get(0);                                      int x = (Integer) list.get(0);
* list.set(0, 10);                                          list.set(0, (Integer) 10);
*
* */