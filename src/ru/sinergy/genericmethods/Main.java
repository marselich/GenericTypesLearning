package ru.sinergy.genericmethods;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        String[] strings = {"sadas", "as", "qwe", "asd", "zxcursed"};
        Integer[] integers = {13, 53, 64, 743, 12, 123};
        printer.<String>print(strings);
        printer.<Integer>print(integers);
    }
}
