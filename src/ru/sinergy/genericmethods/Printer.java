package ru.sinergy.genericmethods;

public class Printer {


    public <T extends Object> void print(T[] items) { // параметризация метода
        for(T item: items) {
            System.out.println(item);
        }
    }
}
