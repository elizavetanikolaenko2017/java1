package ru.geekbrains.lesson1.HomeWork;

import java.util.Scanner;

public class Zadacha1 {

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner= new Scanner(System.in);
        String str= scanner.nextLine();
        System.out.println("reverseWords(str)="+  reverseWords(str));
    }

    private static String reverseWords(String str) {
        String words="Reverse String";
        String[]arr=words.split(" ");
        for (int i = arr.length -1; i >=0 ; i--) {
            System.out.print(arr[i]);

        }
        return words;
    }

}

/**
 * @apiNote При наличии входной строки измените порядок слов на противоположный.
 *
 * return words
 */