package lesson3;

import java.util.Random;
import java.util.Scanner;

public class XOGame {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final char PLAYER = 'X';
    public static final char COMPUTER = 'O';
    public static final char EMPTY = '_';

    public static int size = 3;
    public static String playerName;
    public static char[][] map;
    public static final Random random = new Random();

    public static void startGame() {
        System.out.println("Введите имя игрока: ");
        playerName = SCANNER.nextLine();
        do {
            System.out.println("Введите размер поля(3 или 5): ");
            size = SCANNER.nextInt();
        } while (size != 3 && size != 5);
    }

    public static void initGame() {
        map = new char[size][size];
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                map[y][x] = EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int y = 0; y < size; y++) {
            for (int x = 0; x < size; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void playerTurn() {
        int x, y;
        System.out.println(playerName + ", ваш ход, введите значение X и Y:");
        while (true) {
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
            if (isValidTurn(x, y)) {
                if (isEmpty(x, y)) {
                    break;
                } else {
                    System.out.println("Клетка с координатами X и Y занята!");
                }
            } else {
                System.out.println("Значение X и Y должны быть в от 0 до " + size);
            }
        }
        map[y][x] = PLAYER;
    }

    public static void computerTurn() {
        int x, y;
        System.out.println("Ход игрока Computer");
        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (!isValidTurn(x, y) || !isEmpty(x, y));
        map[y][x] = COMPUTER;
    }

    public static boolean isValidTurn(int x, int y) {
        return (x >= 0) && (x < size) && (y >= 0) && (y < size);
    }

    public static boolean isEmpty(int x, int y) {
        return map[y][x] == EMPTY;
    }

    public static boolean isWin(char field) {
        int countX = 0;
        int countY = 0;
        int countDiagonalOne = 0;
        int countDiagonalTwo = 0;

        switch (size) {
            case 3:
                for (int y = 0; y < 3; y++) {
                    for (int x = 0; x < 3; x++) {
                        if (map[y][x] == field) countX++;
                        if (countX == 3) return true;
                    }
                    countX = 0;
                }
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (map[y][x] == field) countY++;
                        if (countY == 3) return true;
                    }
                    countY = 0;
                }
                for (int i = 0; i < 3; i++) {
                    if (map[i][i] == field) countDiagonalOne++;
                    if (map[i][2 - i] == field) countDiagonalTwo++;
                    if (countDiagonalOne == 3 || countDiagonalTwo== 3) return true;
                }
                break;
            case 5:
                break;
        }
        return false;
    }

    public static boolean isMapFull(){
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == EMPTY) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        startGame();
        initGame();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (isWin(PLAYER)) {
                System.out.println(playerName + " победил!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
            computerTurn();
            printMap();
            if (isWin(COMPUTER)) {
                System.out.println("Computer победил!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
        }

    }
}
