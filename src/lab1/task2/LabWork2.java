package lab1.task2;

import java.util.Scanner;

public class LabWork2 {
    // Задание 2. Задача 1.
    public int abs(int x) {
        if (x < 0) {
            return -x;
        }
        return x;
    }

    // Задание 2. Задача 2.
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }

    // Задание 2. Задача 3.
    public boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        if (x % 3 == 0 || x % 5 == 0) {
            return true;
        }
        return false;
    }

    // Задание 2. Задача 4.
    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + " > " + y;
        } else if (x < y) {
            return x + " < " + y;
        } else {
            return x + " == " + y;
        }
    }

    // Задание 2. Задача 5
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LabWork2 lab2 = new LabWork2();
        boolean keepRunning = true;

        System.out.println("Лабораторная работа №1. Задание 2.");

        while (keepRunning) {
            System.out.println("Меню:");
            System.out.println("1 - Вычислить модуль числа");
            System.out.println("2 - Безопасное деление");
            System.out.println("3 - Проверить деление на 3 и 5");
            System.out.println("4 - Сравнить два числа");
            System.out.println("5 - Найти максимальное из трех чисел");
            System.out.println("0 - ВЫХОД");
            System.out.print("Номер задачи (0 - 5): ");

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка: Введите число.");
                sc.next();
            }
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите целое число x: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите целое число.");
                        sc.next();
                    }
                    int x = sc.nextInt();
                    System.out.println("Результат: " + lab2.abs(x));
                    break;

                case 2:
                    System.out.print("Введите делимое (x): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите целое число.");
                        sc.next();
                    }
                    int divX = sc.nextInt();

                    System.out.print("Введите делитель (y): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите целое число.");
                        sc.next();
                    }
                    int divY = sc.nextInt();

                    System.out.println("Результат деления: " + lab2.safeDiv(divX, divY));
                    break;

                case 3:
                    System.out.print("Введите целое число x: ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите целое число.");
                        sc.next();
                    }
                    int num35 = sc.nextInt();
                    System.out.println("Результат: " + lab2.is35(num35));
                    break;

                case 4:
                    System.out.print("Введите первое число (x): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите целое число.");
                        sc.next();
                    }
                    int decX = sc.nextInt();

                    System.out.print("Введите второе число (y): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите целое число.");
                        sc.next();
                    }
                    int decY = sc.nextInt();

                    System.out.println("Результат: " + lab2.makeDecision(decX, decY));
                    break;

                case 5:
                    System.out.print("Введите первое число (x): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите целое число.");
                        sc.next();
                    }
                    int maxX = sc.nextInt();

                    System.out.print("Введите второе число (y): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите целое число.");
                        sc.next();
                    }
                    int maxY = sc.nextInt();

                    System.out.print("Введите третье число (z): ");
                    while (!sc.hasNextInt()) {
                        System.out.println("Ошибка! Введите целое число.");
                        sc.next();
                    }
                    int maxZ = sc.nextInt();

                    System.out.println("Максимальное из трех чисел: " + lab2.max3(maxX, maxY, maxZ));
                    break;

                case 0:
                    System.out.println("Завершение работы.");
                    keepRunning = false;
                    break;

                default:
                    System.out.println("Такой задачи нет. Выберите от 0 до 5.");
                    break;
            }
        }
        sc.close();
    }
}