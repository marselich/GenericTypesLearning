package ru.sinergy;

import java.util.ArrayList;
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


        ArrayList numbers = new ArrayList(); // сохраняет Object

        for (int i = 0; i < 10; i++) {
            numbers.add(i + 10);
//            numbers.add(i + 10.2f);
        }

        int sum = 0;
        for (Object o : numbers) {
            sum += (Integer) o;
        }
        System.out.println(sum);


    }
}