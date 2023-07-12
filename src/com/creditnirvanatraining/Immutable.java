package com.creditnirvanatraining;

public class Immutable {
        final private int age;
        final private String name;
        Prof p;
        Prof temp;

        Immutable(int age,String name, Prof p)
        {
            this.age=age;
            this.name = name;
            this.temp = new Prof(p.year, p.company);
            this.p=this.temp;
        }
        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "ImutableEx{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

