package lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {
        //  1) Задать целочисленный массив, состоящий из элементов 0 и 1.
        //     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        //     Написать метод, заменяющий в  принятом массиве 0 на 1, 1 на 0;
        System.out.println("Проверка задания №1:");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Массив array до замены: " + Arrays.toString(array));
        replaceElement(array);
        System.out.println("Массив array после замены: " + Arrays.toString(array));
        System.out.println();

        //  2) Задать пустой целочисленный массив размером 8.
        //     Написать метод, который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22.
        System.out.println("Проверка задания №2:");
        int[] array2 = new int[8];
        System.out.println("Массив array2 после иницилизации: " + Arrays.toString(array2));
        fillTheArray(array2);
        System.out.println("Массив array2 после заполнения: " + Arrays.toString(array2));
        System.out.println();

        //  3) Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
        //     принимающий на вход массив и умножающий числа меньше 6 на 2.
        System.out.println("Проверка задания №3:");
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив array3 после иницилизации: " + Arrays.toString(array3));
        multiplication(array3);
        System.out.println("Массив array3 после выполнения метода multiplication(): " + Arrays.toString(array3));
        System.out.println();

        //  4) Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
        System.out.println("Проверка задания №4:");
        int[] array4 = {5, 2, 11, 4, 8, 9, 1};
        System.out.println("Массив array4 после иницилизации: " + Arrays.toString(array4));
        System.out.println("Минимальное значение элемента из массива array4: " + findMin(array4));
        System.out.println("Максимальное значение элемента из массива array4: " + findMax(array4));
        System.out.println();

        //  5) * Создать квадратный целочисленный массив (количество строк и столбцов одинаковое),
        //     заполнить его диагональные элементы единицами, используя цикл(ы);
        System.out.println("Проверка задания №5:");
        final int SIZE = 10;
        int[][] sqrArray = new int[SIZE][SIZE];
        fillSqrArray(sqrArray);
        System.out.println("Массив sqrArray:");
        showSqrArray(sqrArray);
        System.out.println();

        //  6) ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        //     метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры:
        //     checkBalance([1, 1, 1, || 2, 1]) → true,
        //     checkBalance ([2, 1, 1, 2, 1]) → false,
        //     checkBalance ([10, || 1, 2, 3, 4]) → true.
        //     Абстрактная граница показана символами ||, эти символы в массив не входят.
        System.out.println("Проверка задания №6:");
        int[] testArray1 = {1, 1, 1, 2, 1};
        int[] testArray2 = {2, 1, 1, 2, 1};
        int[] testArray3 = {10, 1, 2, 3, 4};
        System.out.println("checkBalance([1, 1, 1, || 2, 1]) → true, результат программы: " + checkBalance(testArray1));
        System.out.println("checkBalance ([2, 1, 1, 2, 1]) → false, результат программы: " + checkBalance(testArray2));
        System.out.println("checkBalance ([10, || 1, 2, 3, 4]) → true, результат программы: " + checkBalance(testArray3));
        System.out.println();

        //  7) *** Написать метод, которому на вход подаётся одномерный массив и число n
        //     (может быть положительным, или отрицательным),
        //     при этом метод должен циклически сместить все элементы массива на n позиций.
        //     [1,2,3,4,5], -2 => [3,4,5,1,2]
        //     [1,2,3,4,5], 2 => [4,5,1,2,3]
        //  8) **** Не пользоваться вспомогательным массивом при решении задачи 7.
        System.out.println("Проверка задания №7:");
        System.out.println("Исходный массив: [1,2,3,4,5]");
        int[] testShiftArray = {1, 2, 3, 4, 5};
        shiftOf(testShiftArray, 2);
        System.out.println("n = 2, testShiftArray: " + Arrays.toString(testShiftArray));
        int[] testShiftArray2 = {1, 2, 3, 4, 5};
        shiftOf(testShiftArray2, -2);
        System.out.println("n = -2, testShiftArray2: " + Arrays.toString(testShiftArray2));

    }

    static void replaceElement(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
                continue;
            } // тут не пишу else, т.к. каждый элемент массива может быть отличным от 0 и 1
            if (a[i] == 1) a[i] = 0;
        }
    }

    static void fillTheArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 + 3 * i;
        }
    }

    static void multiplication(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) a[i] *= 2;
        }
    }

    static int findMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    static void fillSqrArray(int[][] sqrA) {
        int length = sqrA.length;
        for (int y = 0; y < length; y++) {
            for (int x = 0; x < length; x++) {
                boolean isFill = (x == y)
                        || (x == (length - y - 1))
                        || (y == (length - x - 1));
                if (isFill) sqrA[y][x] = 1;
            }
        }
    }

    static void showSqrArray(int[][] sqrA) {
        for (int y = 0; y < sqrA.length; y++) {
            for (int x = 0; x < sqrA[y].length; x++) {
                System.out.print(sqrA[y][x] + " ");
            }
            System.out.println();
        }
    }

    static boolean checkBalance(int[] chkArr) {
        for (int i = 0; i < chkArr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int indexLeft = 0; indexLeft < i; indexLeft++) {
                leftSum += chkArr[indexLeft];
            }

            for (int indexRight = i; indexRight < chkArr.length; indexRight++) {
                rightSum += chkArr[indexRight];
            }

            if (leftSum == rightSum) return true;
        }
        return false;
    }

    static void shiftOf(int[] a, int n) {
        int temp;
        for (int i = 0; i < Math.abs(n); i++) {
            if (n >= 0) {
                temp = a[0];
                for (int j = 0; j < a.length; j++) {
                    if (j == (a.length - 1)) {
                        a[j] = temp;
                        break;
                    }
                    a[j] = a[j + 1];
                }
            } else {
                int endIndex = a.length - 1;
                temp = a[endIndex];
                for (int j = endIndex; j >= 0; j--) {
                    if (j == 0) {
                        a[j] = temp;
                        break;
                    }
                    a[j] = a[j - 1];
                }
            }
        }
    }
}


//        7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
//        при этом метод должен циклически сместить все элементы массива на n позиций.
//        [1,2,3,4,5], -2 => [3,4,5,1,2]
//        [1,2,3,4,5], 2 => [4,5,1,2,3]
//        8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
