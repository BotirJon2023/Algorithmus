package org.example;

public class SequenceCalculator {

    public static int calculateNthTerm(int n) {
        if (n <= 1) {
            return 1;
        } else if (n % 2 == 0) {
            int nOver2 = n / 2;
            return calculateNthTerm(nOver2) + calculateNthTerm(nOver2 - 1);
        } else {
            int nOver2 = n / 2;
            return calculateNthTerm(nOver2) - calculateNthTerm(nOver2 - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10; // желаемое число n
        int result = calculateNthTerm(n);
        System.out.println("a(" + n + ") = " + result);
    }
}
