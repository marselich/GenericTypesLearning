package ru.sinergy.customgenerictypes;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(123123, 511244);
        System.out.println(acc1.getId());


        Account acc2 = new Account("gdsf324gsd", 511244);
        System.out.println(acc2.getId());

        int a = ((Integer)acc2.getId()) + 10;
        System.out.println(a);
    }
}
