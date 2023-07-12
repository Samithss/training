package com.creditnirvanatraining;

public class Main {
    public static void main(String[] args) {
        Prof p = new Prof(199, "CN");
        Immutable i = new Immutable(30, "Pall", p);
        System.out.println(i.getAge());
        System.out.println(i.p.year);
        System.out.println(p.company);
        i.p.year = 111;
        System.out.println(i.p.year);
    }
}
