package ru.sinergy.customgenerictypes;

public class Main {
    public static void main(String[] args) {
        Account<Integer> acc1 = new Account(123123, 511244);
        System.out.println(acc1.getId());


        Account<String> acc2 = new Account("gdsf324gsd", 511244);
        System.out.println(acc2.getId());

        int a = acc1.getId() + 10; // Опасное преобразование типов
        System.out.println(a);


        Account<Integer> acc3 = new Account(1399, 10, "something");
    }
}
