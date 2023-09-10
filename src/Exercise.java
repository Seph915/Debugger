package javaOopAdvanced.AdvancedIDEfeaturesDebugger;

import org.junit.jupiter.api.Assertions;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        int number = 5;
        int factorial = calculateFactorial(number);
        Assertions.assertEquals(120, factorial);
    }

    private static int calculateFactorial(int number) {
        //Fix this code
        int result = 1;
        for (int i = number; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }

    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        String input = "hello";
        String reversedString = reverseString(input);
        Assertions.assertEquals("olleh", reversedString);
    }

    private static String reverseString(String input) {
        //Fix this code

        String reversed = "";
        for (int i = input.length(); i >= 1; i--) {
            reversed += input.charAt(i - 1);
        }
        return reversed;
    }

    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Assertions.assertFalse(isPositive(-5));
        Assertions.assertFalse(isPositive(-55));
        Assertions.assertFalse(isPositive(0));
        Assertions.assertTrue(isPositive(5));
        Assertions.assertTrue(isPositive(55));
        Assertions.assertTrue(isPositive(4567));
    }

    private static boolean isPositive(int num) {

        return num > 0;
    }
}
