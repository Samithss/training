package com.creditnirvanatraining;

public class StaticandNonstatic {
    static {
        System.out.println("i am in main class");
    }
    public static void main(String[] args) {
     Ba aa=new Ba();
     Ba aa1=new Ba();
    }
}
class Aa{
    static {
        System.out.println("i am in static block Aa");
    }
    {
        System.out.println("i am in non static blockA");
    }

}
class Ba extends Aa{
    static {
        System.out.println("i am in static block Ba");
    }
    {
        System.out.println("i am in non static blockB");
    }
}