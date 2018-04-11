package com.company;
public class Main {

    public static void main(String[] args) {

        //autoboxing
        Short num1 = 1;
        Byte num2 = 10;
        Integer num3 = 100;
        Long num4 = 10000l;
        Float num5 = 3.5f;
        Double num6 = 3.55555;
        Boolean flag = true;
        //Character a = 'b';

        //auto-unboxing
        int num7 = num3;
        num7++;

        System.out.println(num7);

        System.out.printf("Hello %s", "Olá Mundo");
    }
}
