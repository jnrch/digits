package digitos;

import java.util.Scanner;

public class ThreeDigit {

    private static final String ONE_ZERO = "0";
    private static final String TWO_ZERO = "00";

    public static void main(String[] args) {

        double operationResult;
        int potency;
        String[] numbers;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a potency number: ");
        potency = scanner.nextInt();
        operationResult = Math.pow((3 + Math.sqrt(5)), potency);

        numbers = String.valueOf(operationResult).split("\\.");
        String numbersBeforeComa = numbers[0];
        int numbersLength = numbers[0].length();

        switch (numbersLength) {
            case 2 -> System.out.println(ONE_ZERO + numbersBeforeComa.substring(numbersLength - 2));
            case 1 -> System.out.println(TWO_ZERO + numbersBeforeComa.substring(numbersLength - 1));
            default -> System.out.println(numbersBeforeComa.substring(numbersLength - 3));
        }
    }
}

