import java.util.*;

public class TestClass2 {
    public static void main(String[] args) {
        Scanner exerciseNumber = new Scanner(System.in);
        System.out.println("Input exercise number from 1 to 12");
        int exNumber = exerciseNumber.nextInt();
        switch (exNumber) {
            case 1:
                sortArray();
                break;
            case 2:
                commonElements();
                break;
            case 3:
                convertArrayList();
                break;
            case 4:
                iterateElements();
                break;
            case 5:
                reverseElements();
                break;
            case 6:
                clearArrayList();
                break;

            case 7:
                generate100Numbers();
                break;


            default:
                System.out.println("Exercise not found, please input a number between 1 and 10");
                break;
        }
    }

    public static void sortArray() {
        int[] intArray = {22, 3, 33, 4, 44, 5, 55, 6};
        String[] stringArray = {"cat", "zebra", "dog", "mouse"};
        Arrays.sort(intArray);
        Arrays.sort(stringArray);
        System.out.println("Your sorted int array is " + Arrays.toString(intArray));
        System.out.println("Your sorted string array is " + Arrays.toString(stringArray));
    }

    public static void commonElements() {
        String[] stringArray = {"cat", "zebra", "dog", "mouse"};
        String[] stringArray2 = {"cat", "whale", "dog", "tiger"};
        ArrayList<String> commonElementsArray = new ArrayList<>();
        for (String s : stringArray) {
            System.out.println(s);
            for (String s1 : stringArray2) {
                if (s.equals(s1)) {
                    commonElementsArray.add(s);
                }

            }

        }
        System.out.println("The common elements are: " + commonElementsArray);
    }

    public static void convertArrayList() {
        String[] stringArray = {"cat", "zebra", "dog", "mouse"};
        ArrayList<String> arrayListConversion = new ArrayList<>(Arrays.asList(stringArray));
        System.out.println("This is your array list: " + arrayListConversion);

    }

    public static void iterateElements() {
        String[] stringArray = {"cat", "zebra", "dog", "mouse"};

        for (String s : stringArray) {
            System.out.println(s);
        }
    }

    public static void reverseElements() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("dog");
        arrayList.add("cat");
        arrayList.add("tree");
        arrayList.add("4");
        arrayList.add("house");
        Collections.reverse(arrayList);
        System.out.println("Your reverse list is " + arrayList);
    }

    public static void clearArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("dog");
        arrayList.add("cat");
        arrayList.add("tree");
        arrayList.add("4");
        arrayList.add("house");
        System.out.println("Your arraylist: " + arrayList + " will be cleared");
        arrayList.clear();
        if (arrayList.isEmpty()) {
            System.out.println("Array list has been cleared and current values are: " + arrayList);
        }
    }

    public static void generate100Numbers() {
        int max = 100;
        int min = 1;
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer number = random.nextInt(max) + min;
            list.add(number);

        }
        List<Integer> biggerThanTen = new ArrayList<>();
        for (Integer integer : list) {
            if (integer >= 10) {
                biggerThanTen.add(integer);
            }

        }
        System.out.println("The random numbers generated greater than 10 are: " + biggerThanTen);
    }
}
