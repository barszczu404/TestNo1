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
    public void askUserFor10WordsAndDisplayLongestAndShortestWordWithNumberOfLettersItHasAndNumberOfPalindromes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 różnych słów");
        String[] enteredWords = new String[10];
        for (int i = 0; i < enteredWords.length; i++) {
            System.out.println("Podaj słowo");
            enteredWords[i] = scanner.nextLine();
        }

        String[] approvedEnteredWords = new String[10];
        for (int i = 1; i < enteredWords.length; i++) {
            if (!enteredWords[0].equalsIgnoreCase(enteredWords[i])) {
                System.arraycopy(enteredWords, 0, approvedEnteredWords, 0, approvedEnteredWords.length);
            } else {
                System.out.println("Podane przez Ciebie słowa nie są różne, zacznij jeszcze raz");
                break;
            }
        }

        boolean isSwapped;
        String temp;
        for (int i = 0; i < approvedEnteredWords.length - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < approvedEnteredWords.length - i - 1; j++) {
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

        System.out.println(Arrays.toString(approvedEnteredWords));
        System.out.println("Najdłuższe podane przez Ciebie słowo to: " + approvedEnteredWords[9] + " i ma "
                + approvedEnteredWords[9].length() + " znaków a najkrótsze to: " + approvedEnteredWords[0]
                + " i ma " + approvedEnteredWords[0].length() + " znaków");

        //ile jest palindromów
        int palindromeCnt = 0;
        for (String approvedEnteredWord : approvedEnteredWords) {
            String palindrome = new StringBuilder(approvedEnteredWord).reverse().toString();
            if (approvedEnteredWord.equalsIgnoreCase(palindrome)) {
                palindromeCnt++;
            }
        }
        System.out.println("Podałeś " + palindromeCnt + " palindromów");
    }
}
