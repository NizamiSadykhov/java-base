package lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Проверка задания №1:");
        double resultEx1 = calculate(1, 2,3,4);
        System.out.println("1 * (2 + (3 / 4)) = " + resultEx1 + "\n");

        System.out.println("Проверка задания №2:");
        String ex2Result1 = "Сумма 5 и 2 в интервале? " + sumInTheInterval(5, 2) + "\n";
        String ex2Result2 = "Сумма 7 и 8 в интервале? " + sumInTheInterval(7, 8) + "\n";
        String ex2Result3 = "Сумма 12 и 10 в интервале? " + sumInTheInterval(12, 10) + "\n";
        System.out.println(ex2Result1 + ex2Result2 + ex2Result3);

        System.out.println("Проверка задания №3:");
        System.out.println("Число 5 положительное? " + isPositiveNumber(5));
        System.out.println("Число 0 положительное? " + isPositiveNumber(0));
        System.out.println("Число -1 положительное? " + isPositiveNumber(-1) + "\n");

        System.out.println("Проверка задания №4:");
        printName("Никита Джигурда");

        System.out.println("Проверка задания №5:");
        System.out.println("0 год високосный? " + isYearLeap(0));
        System.out.println("100 год високосный? " + isYearLeap(100));
        System.out.println("2000 год високосный? " + isYearLeap(2000));
        System.out.println("2020 год високосный? " + isYearLeap(2020));
    }

    //  1) Написать метод вычисляющий выражение a * (b + (c / d))
    //  и возвращающий результат с плавающей точкой,
    //  где a, b, c, d – целочисленные входные параметры этого метода;
    private static double calculate(int a, int b, int c, int d) {
        return a * (b + ((double) c / d));
    }

    //  2) Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах
    //  от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    private static boolean sumInTheInterval(int a, int b) {
        int sum = a + b;
        return sum > 10 & sum <= 20;
    }

    //  3) Написать метод, которому в качестве параметра передается целое число,
    //  метод должен проверить положительное ли число передали, или отрицательное.
    //  Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    private static boolean isPositiveNumber(int a){
        return  a >= 0;
    }

    //  4) Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //  метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.
    private static void printName(String name){
        System.out.println("Привет, " + name + "!\n" );
    }

    //  5)*Написать метод, который определяет является ли год високосным.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    // Для проверки работы вывести результаты работы метода в консоль
    private static boolean isYearLeap(int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0){
            return false;
        } else return year % 4 == 0;
    }
}
