package com.example.a03donguler;

public class BreakVeContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("--------------------");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}

/*
break => Döngüyü sonlandırır.
continue => Döngüde o anki adımdan sonraki adıma geçer.
 */