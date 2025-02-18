package test1.services;

public class Zad2Service {


    /* zad2
      dla kazdej liczby dwucyfrowej wypisz jej ilosc dzielnikow
    */

    public void digitAllDivisorsOfEachTwoDigitNumber() {
        for (int i = 10; i <= 99; i++) {
            int divisorsCnt = 0;
            System.out.print("Liczba " + i + " ma ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    String divisors = j + ", ";
                    String[] selectingDivisor = divisors.split(", ");
                    int[] arrayDivisors = new int[selectingDivisor.length];
                    for (int k = 0; k < arrayDivisors.length; k++) {
                        arrayDivisors[k] = Integer.parseInt(selectingDivisor[k]);
                        divisorsCnt++;
                    }
                }
            }
            System.out.println(divisorsCnt + " dzielników");
        }
    }

}
