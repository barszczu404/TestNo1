package test1.services;

import java.util.Arrays;
import java.util.Scanner;

public class Zad4Service {

    /*zad4
        zapytaj uzytkownika o liczby rozdzielone spacja, nastepnie:
        -wypisz mediane wprowadzonych liczb; nie w petli!
        -wypisz wszystkie liczby pierwsze;
         */
    public void askUserForNumbersSeparatedBySpaceAndCalculateMedianAndDigitAllPrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną ilość liczb, oddzielaj je spacją");
        String enteredNumber = scanner.nextLine();
        String[] selectingNumbers = enteredNumber.split("\\s");
        int[] numbers = new int[selectingNumbers.length];
        for (int i = 0; i < selectingNumbers.length; i++) {
            try {
                numbers[i] = Integer.parseInt(selectingNumbers[i]);
            } catch (NumberFormatException e) {
                System.out.println(selectingNumbers[i] + " nie jest liczbą całkowitą");
            }
        }

        //mediana
        Arrays.sort(numbers);
        double median = 0.0;
        if (numbers.length % 2 == 0) {
            median = (double) (numbers[numbers.length / 2] + numbers[(numbers.length / 2) - 1]) / 2;
        } else {
            median = numbers[numbers.length / 2];
        }
        System.out.println("Mediana podanych przez Ciebie liczb wynosi: " + median);

        //liczby pierwsze
        System.out.println("Liczby piewsze z podanych przez Ciebie liczb to: ");
        for (int number : numbers) {
            if (!(number % 2 == 0) || number == 2) {
                System.out.print(number + ", ");
            }
        }
    }
}
