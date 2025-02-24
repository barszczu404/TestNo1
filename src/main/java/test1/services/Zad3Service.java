package test1.services;

import java.util.Arrays;
import java.util.Scanner;

public class Zad3Service {

    /*zad3
        poproś użytkownika o podanie 10 róznych napisów,
        wpisz je wszystkie do tablicy a nastepnie:
        -wypisz najdluzszy napis i ile ma znakow;
        -wypisz najktorszy napis i ile ma znakow;
        -wypisz ile jest palindromow wsrod napisow (podczas porownania ignoruj wielkosc liter)
         */
    public void askUserFor10Words() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 różnych słów");
        String[] enteredWords = new String[10];
        int palindromeCnt = 0;
        for (int i = 0; i < enteredWords.length; i++) {
            System.out.println("Podaj słowo");
            enteredWords[i] = scanner.nextLine();
        }

        String[] approvedEnteredWords = new String[10];
        //outer_loop:
        for (int i = 1; i < enteredWords.length; i++) {
            if (enteredWords[0].equalsIgnoreCase(enteredWords[i])) {
                System.out.println("Podane przez Ciebie słowa nie są różne, zacznij jeszcze raz");
                break;
            } else {
                System.arraycopy(enteredWords, 0, approvedEnteredWords, 0, approvedEnteredWords.length);

                boolean isSwapped;
                String temp;
                //inner_loop:
                for (int k = 0; k < approvedEnteredWords.length - 1; k++) {
                    isSwapped = false;
                    for (int j = 0; j < approvedEnteredWords.length - k - 1; j++) {
                        if (approvedEnteredWords[j].length() > approvedEnteredWords[j + 1].length()) {
                            temp = approvedEnteredWords[j];
                            approvedEnteredWords[j] = approvedEnteredWords[j + 1];
                            approvedEnteredWords[j + 1] = temp;
                            isSwapped = true;
                        }
                    }
                    if (!isSwapped) {
                        break;
                    }
                }

                //ile jest palindromów
                for (String approvedEnteredWord : approvedEnteredWords) {
                    String palindrome = new StringBuilder(approvedEnteredWord).reverse().toString();
                    if (approvedEnteredWord.equalsIgnoreCase(palindrome)) {
                        palindromeCnt++;
                    }
                }
                System.out.println("Najdłuższe podane przez Ciebie słowo to: " + approvedEnteredWords[9] + " i ma "
                        + approvedEnteredWords[9].length() + " znaków a najkrótsze to: " + approvedEnteredWords[0]
                        + " i ma " + approvedEnteredWords[0].length() + " znaków");
                System.out.println("Podałeś " + palindromeCnt + " palindromów");
                break;
            }
        }
    }
}