package test1.services;

public class Zad2Service {


    /* zad2
      dla kazdej liczby dwucyfrowej wypisz jej ilosc dzielnikow
    */

    public void digitAllDivisorsOfEachTwoDigitNumber() {
        for (int i = 10; i <= 99; i++) {
            int divisorsCnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisorsCnt++;
                }
            }
            System.out.println("Liczba " + i + " ma " + divisorsCnt + " dzielników");
        }
    }
}


