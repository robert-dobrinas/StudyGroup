import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TestClass {
    public static void main(String[] args) {
        Scanner exerciseNumber = new Scanner(System.in);
        System.out.println("Input exercise number from 1 to 10");
        int exNumber = exerciseNumber.nextInt();
        switch (exNumber) {
            case 1:
                checkOddEven();
                break;
            case 2:
                sumAverageInt();
                break;
            case 3:
                checkPerfectSquare();
                break;
            case 4:
                sumProductMinMax();
                break;
            case 5:
                reverseNumber();
                break;
            case 6:
                countVowelsDigits();
                break;


            default:
                System.out.println("Exercise not found, please input a number between 1 and 10");
                break;
        }

        System.out.println("Bye!!!");
    }

    public static void checkOddEven() {
        System.out.println("Input number now:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }

    public static void sumAverageInt() {
        float sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is" + " " + sum);
        System.out.println("The average of the sum is" + " " + sum / 100);
    }

    public static void checkPerfectSquare() {
        System.out.println("Check perfect square. Input number now:");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();

        double sqrtNumber = Math.sqrt(number);
        boolean isSqrt = (sqrtNumber - Math.floor(sqrtNumber)) == 0;
        if (isSqrt) {
            System.out.println(number + " Is a perfect square root");
        } else {
            System.out.println(number + " Is not a perfect square root");
        }


    }

    public static void sumProductMinMax() {
        List<Integer> numberList = new ArrayList<>();
        System.out.println("Welcome to sumProductMinMax, enter your first number:");
        Scanner firstNumber = new Scanner(System.in);
        numberList.add(firstNumber.nextInt());
        System.out.println("Enter your second number:");
        Scanner secondNumber = new Scanner(System.in);
        numberList.add(secondNumber.nextInt());
        System.out.println("Enter your third and final number:");
        Scanner thirdNumber = new Scanner(System.in);
        numberList.add(thirdNumber.nextInt());
        int minNumber = Collections.min(numberList);
        int maxNumber = Collections.max(numberList);
        int sum = 0;
        int product = 1;
        for (Integer number : numberList) {
            sum += number;
        }
        for (Integer number : numberList) {
            product *= number;
        }
        System.out.println("The smallest number is : " + minNumber);
        System.out.println("The biggest number is : " + maxNumber);
        System.out.println("The sum of the three numbers is : " + sum);
        System.out.println("The product of the three numbers is: " + product);
    }

    public static void reverseNumber() {
        System.out.println("Reverse Number Program. Please input a positive number:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int initialNumber = number;
        int reverse = 0;
        while (number < 0) {
            System.out.println("The number you have selected is negative. Please enter a positive number: ");
            Scanner positiveNumber = new Scanner(System.in);
            number = positiveNumber.nextInt();
            initialNumber = number;
        }
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println("The reverse number for your input " + initialNumber + " is : " + reverse);


    }

    public static void countVowelsDigits() {
        System.out.println("Please enter a string containing vowels and digits: ");
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (Pattern.matches("[aeiou]|[0-9]", Character.toString(ch))) {
                count++;
            }

        }
        System.out.println("There are " + count + " vowels and/or numbers in the given string");

    }
}
