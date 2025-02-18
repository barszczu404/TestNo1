package test1.services;

public class Zad1Service {

    /* zad1
        wypisz wszystkie liczby 3 cyfrowe, ktorych suma cyfr dziesiatek i setek jest rowna cyfrze jednosci (np.314 bo 3+1=4)
         */

    public void displayAll3DigitNumbersWhoseSumOfHundredsAndTensEqualUnitsDigit() {
        for (int i = 100; i < 999; i++) {
            int hundredsDigit = i / 100 % 10;
            int tensDigit = i / 10 % 10;
            int unitsDigit = i % 10;
            if (hundredsDigit + tensDigit == unitsDigit) {
                System.out.println(i);
            }
        }
    }
}
