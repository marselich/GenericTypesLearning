package ru.sinergy;

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

    for(Object o: objects) {
        if(o instanceof String) {
            String s = (String) o;
            System.out.println(s);
        }
    }


    }
}