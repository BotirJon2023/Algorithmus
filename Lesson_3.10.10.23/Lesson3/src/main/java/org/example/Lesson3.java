package org.example;

public class Lesson3 {

    public static void main(String[] args) {

        int result = someRecursionWithReturnValue(5);
        System.out.println("Result = " + result);
        System.out.println(someRecursionWith2Args(5, 10));

        someRecurcion(10);

    }
    private static int someRecursionWith2Args(int n, int m) {
        if (n <= 0 || m <= 0) ; // base condition
        int result = n + m + someRecursionWith2Args(-1, -1);
        return result;
    }




    public static void someRecurcion(int n) {
        System.out.println("currently n = " + n);
        //        if (n == 100) return;
        // if (n == 1000) return;
        int nMin = 0;
        int nMax = 1000;
        if (n < nMin || n > nMax) return;
        someRecurcion(n + 1);

    }

    public static int someRecursionWithReturnValue(int n) {
        System.out.println("Currently n = " + n);
    //    if (n == -5) return -5; // base condition
//        if (n == 0) return 0; // base condition
        if (n == 0) return 1; // base condition

//        int value = 1 + someRecursionWithReturnValue(n - 1);
//        int value = n + someRecursionWithReturnValue(n - 1);
        int value = n * someRecursionWithReturnValue(n - 1);

        System.out.println("Currently value = " + value);
        return value;

    }
}
