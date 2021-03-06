import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;
import java.util.regex.Pattern;

public class TestClass {
    public static void main(String[] args) {
        Scanner exerciseNumber = new Scanner(System.in);
        System.out.println("Input exercise number from 1 to 10 (11 is another solution to the last problem)");
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
            case 7:
                addArrayElement();
                break;
            case 8:
                removeOccurence();
                break;
            case 9:
                bubbleSort();
                break;
            case 10:
                averageValue();
                break;
            case 11:
                averageValue2();
                break;


            default:
                System.out.println("Exercise not found, please input a number between 1 and 11");
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

    public static void addArrayElement() {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.add(4);
        newArrayList.add(5);
        newArrayList.add(6);
        System.out.println("Your current Array is: " + newArrayList);
        newArrayList.add(2, 3);
        System.out.println("Your new Array is: " + newArrayList);


    }

    public static void removeOccurence() {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        int key = 2;
        System.out.println("Your array list is: " + intList);
        intList.removeAll(Collections.singletonList(key));
        System.out.println("Your new array list is : " + intList);


    }

    public static void bubbleSort() {
        int[] intArray = {22, 3, 33, 4, 44, 5, 55, 6};
        System.out.println("Your array is: " + Arrays.toString(intArray));
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < intArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println("Your bubble sorted array is: " + Arrays.toString(intArray));

    }

    public static void averageValue() {
        int[] intArray = {12, 18, 4, 88, 56, 2, 99, 42};
        System.out.println("This is your original array: " + Arrays.toString(intArray));
        int max = intArray[0];
        int min = intArray[0];
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i];
            if (intArray[i] > max)
                max = intArray[i];
            else if (intArray[i] < min)
                min = intArray[i];
        }
        int newArrayLength = intArray.length - 2;
        System.out.println("New array length is: " + newArrayLength);
        System.out.println("Min is: " + min);
        System.out.println("MAX is: " + max);
        System.out.println("Sum is: " + sum);

        int average = ((sum - max - min) / (newArrayLength));
        System.out.println("This is the average of your array without min and max: " + average);


    }

    public static void averageValue2() {
        int[] intArray = {12, 18, 4, 88, 56, 2, 99, 42};
        System.out.println("Your array is all messed up: " + Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println("I have sorted your array and now i will calculate the average without first and last item " + Arrays.toString(intArray));
        int sum = 0;
        for (int i = 1; i < intArray.length - 1; i++) {
            sum += intArray[i];

        }
        int average = sum / (intArray.length - 2);
        System.out.println("The average of your array without first and last item is: " + average);
    }
}
