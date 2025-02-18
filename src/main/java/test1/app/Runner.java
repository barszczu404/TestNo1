package test1.app;

import test1.services.Zad1Service;
import test1.services.Zad2Service;
import test1.services.Zad3Service;
import test1.services.Zad4Service;

public class Runner {

    public static void main(String[] args) {

        Zad1Service s1 = new Zad1Service();
        s1.displayAll3DigitNumbersWhoseSumOfHundredsAndTensEqualUnitsDigit();

        System.out.println("-------------------------------------------");


        Zad2Service s2 = new Zad2Service();
        s2.digitAllDivisorsOfEachTwoDigitNumber();

        System.out.println("-------------------------------------------");


        Zad3Service s3 = new Zad3Service();
        s3.askUserFor10WordsAndDisplayLongestAndShortestWordWithNumberOfLettersItHasAndNumberOfPalindromes();

        System.out.println("-------------------------------------------");


        Zad4Service s4 = new Zad4Service();
        s4.askUserForNumbersSeparatedBySpaceAndCalculateMedianAndDigitAllPrimeNumbers();

    }
}
