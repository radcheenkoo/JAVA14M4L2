import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        methodFive();
        //methodThree();
        //methodFour();
        //methodTwo();
        //methodOne();
    }

    public static void methodFive() {
        String input = "Hello from java Holiday Java goOD Joja";
        String[] sArr = input.split(" ");

        for (int i = 0; i < sArr.length; i++) {
            String str = sArr[i];
            str = str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
            sArr[i] = str.toLowerCase();
        }

        System.out.println(Arrays.toString(sArr));

        System.out.println("String.join(\" \", sArr) = " + String.join(" | ", sArr));
    }

    public static void methodFour() {
        int[] arr = {1, 34, 5, 4, 34, 3, 0, 65, 34};
        System.out.println("arr = " + Arrays.toString(arr));
        int toRemove = 34;
        int toRemoveAmount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toRemove) {
                toRemoveAmount++;
            }
        }

        int[] resArr = new int[arr.length - toRemoveAmount];

        int resArrIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != toRemove) {
                resArr[resArrIndex] = arr[i];
                resArrIndex++;
            }
        }
        System.out.println("resArr = " + Arrays.toString(resArr));
    }

    //прибрати всі слова на лвтеру j
    //в результуючому масиві кожне друге слово в верхньому регістрі
    public static void methodThree() {
        String input = "Hello from java Holiday Java goOD Joja";

        String[] sArr = input.split(" ");

        int jWordCount = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].toLowerCase().startsWith("j")) {
                jWordCount++;
            }
        }

        String[] resArr = new String[sArr.length - jWordCount];

        int resArrIndex = 0;
        for (int i = 0; i < sArr.length; i++) {
            if (!sArr[i].toLowerCase().startsWith("j")) {
                resArr[resArrIndex] = sArr[i];
                resArrIndex++;
            }
        }

        for (int i = 0; i < resArr.length; i++) {
            if ((i + 1) % 2 == 0) {
                resArr[i] = resArr[i].toUpperCase();
            } else {
                resArr[i] = resArr[i].toLowerCase();
            }
        }

        System.out.println(Arrays.toString(resArr));

        System.out.print("[");
        for (int i = 0; i < resArr.length; i++) {
            System.out.print(resArr[i]);
            if (i != resArr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("]");


    }

    public static void methodTwo() {
        int[] arr = {1, 34, 5, 4, 34, 3, 0, 65};

        //1 виконання цикла for
        //1 5 34 4 34 3 0 65
        //1 5 4 34 34 3 0 65
        //1 5 4 34 34 3 0 65
        //1 5 4 34 3 34 0 65
        //1 5 4 34 3 0 34 65
        //2 виконання цикла for
        //1 5 4 34 3 0 34 65
        //1 4 5 34 3 0 34 65
        //1 4 5 3 34 0 34 65
        //1 4 5 3 0 34 34 65
        //3 виконання цикла for
        //1 4 5 3 0 34 34 65
        //1 4 3 5 0 34 34 65
        //1 4 3 0 5 34 34 65
        //4 виконання цикла for
        //1 4 3 0 5 34 34 65
        //1 3 4 0 5 34 34 65
        //1 3 0 4 5 34 34 65
        //5 виконання цикла for
        //1 3 0 4 5 34 34 65
        //1 0 3 4 5 34 34 65
        //6 виконання цикла for
        //1 0 3 4 5 34 34 65
        //0 1 3 4 5 34 34 65
        //7 виконання цикла for
        //0 1 4 5 3 34 34 65
        System.out.println(Arrays.toString(arr));
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void methodOne() {

        int[] arr = {1, 34, 5, 4, 34, 3, 0, 65};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}