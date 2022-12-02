public class Recursive {
    public static int addArray(int[] array, int number) {
        if (number == 0) {
            return 0;
        }

        return addArray(array, number - 1) + array[number - 1];
    }

    public static int maxFactor(int firstNum, int secondNum) {
        if (secondNum == 0) {
            return firstNum;
        }

        return maxFactor(secondNum, firstNum % secondNum);
    }

    public static int maxValue(int[] array, int length) {
        if (length == 1) {
            return array[0];
        }
        if (array[0] < array[length - 1]) {
            array[0] = array[length - 1];
            return maxValue(array, length - 1);
        }

        return maxValue(array, length - 1);
    }

    public static void recamanCycle(int n) {
        int size[] = new int[n];
        size[0] = 0;
        System.out.print(size[0]);

        for (int i = 1; i < n; i++) {
            int num = size[i - 1] - i;

            for (int j = 0; j < i; j++) {
                if ((size[j] == num) || num < 0) {
                    num = size[i - 1] + i;
                    break;
                }
            }
            size[i]= num;
            System.out.print("," + size[i]);
        }
    }


    public static int numberofC(String string, int number) {
        if (number == 1) {
            if (!Character.toString(string.charAt(0)).equals("a") && !Character.toString(string.charAt(0)).equals("e") && !Character.toString(string.charAt(0)).equals("i") &&
                    !Character.toString(string.charAt(0)).equals("o") && !Character.toString(string.charAt(0)).equals("u")) {
                return 1;
            } else {
                return 0;
            }
        }
        if (!Character.toString(string.charAt(number - 1)).equals("a") && !Character.toString(string.charAt(number - 1)).equals("e") && !Character.toString(string.charAt(number - 1)).equals("i") &&
                !Character.toString(string.charAt(number - 1)).equals("o") && !Character.toString(string.charAt(number - 1)).equals("u")) {
            return numberofC(string, number - 1) + 1;
        } else {
            return numberofC(string, number - 1);
        }
    }
    }
