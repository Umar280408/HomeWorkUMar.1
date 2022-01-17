package com.company;

public class Main {

    public static void main(String[] args) {
	String CocaCola;
	final int NUM = 13;
	String word = "fanta";
	CocaCola = NUM + word;
        System.out.println("CocaCola");
        if (NUM < 0){
            System.out.println("вы сохранили отрицательное число");
        }else if (NUM < 0){
            System.out.println("вы сохранили положительное число");
        }else {
            System.out.println("вы сохранили нуль");
        }
    }
}
