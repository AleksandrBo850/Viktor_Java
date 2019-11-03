package com.metaint;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.lang.System;

import static java.lang.System.*;
import static jdk.nashorn.internal.runtime.arrays.ArrayIndex.getArrayIndex;

public class Main {
    public static int getArrayIndex(String[] arr, String value) {

        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equalsIgnoreCase(value) ) {
                k = i;
                break;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int b = 0;
        int iterat = 0;
        char[] alphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('a' + i);
        }
        String[] mas0 = new String[26];
        for (int o = 0; o < 26; o++) {
            mas0[o] = String.valueOf(alphabet[o]);
        }
        int a = (int) Math.floor(Math.random() * alphabet.length);
        String[] mas1 = new String[1];
        mas1[0] = mas0[a];
        Scanner in = new Scanner(System.in);
        while (b == 0) {
            out.print("Input letter : ");
            String letter = in.nextLine();
            boolean retVal = mas1[0].equalsIgnoreCase(letter);
            iterat = iterat + 1;
            if (retVal) {
                out.println("Вы угадали !");

                break;
            } else {
                out.println("Вы не угадали, поробуйте снова");
                if ( getArrayIndex(mas0, letter) > getArrayIndex(mas0, mas1[0])) {
                    out.println("Буква находится раньше по алфавиту");
                }
                if (getArrayIndex(mas0, letter) < getArrayIndex(mas0, mas1[0])) {
                    out.println("Буква находится позже по алфавиту");
                }
            }



        }
        out.println("Количество попыток: ");
        out.print(iterat);

    }
}









