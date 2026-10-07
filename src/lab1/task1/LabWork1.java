package lab1.task1;

import java.util.Scanner;

public class LabWork1 {
    // Задание 1. Задача 1.
    public double fraction(double x) {
        return x - (int) x;
    }

    // Задание 1. Задача 2.
    public int sumLastNums(int x) {
        x = Math.abs(x);
        return (x % 10) + ((x/10) % 10);
    }

    // Задание 1. Задача 3.
    public int charToNum(char x) {
        return x - 48;
    }

    // Задание 1. Задача 4.
    public boolean isPositive(int x) {
        return x > 0;
    }

    // Задание 1. Задача 5.
    public boolean is2Digits(int x) {
        int absoluteX = Math.abs(x);
        return absoluteX >= 10 && absoluteX <= 99;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LabWork1 lab = new LabWork1();
        boolean keepRunning = true;

        System.out.println("Лабораторная работа №1. Задание 1.");

        while (keepRunning) {
            System.out.println("Меню:");
            System.out.println("1 - Вычислить дробную часть числа");
            System.out.println("2 - Найти сумму двух последних знаков числа");
            System.out.println("3 - Перевести символ-цифру в число");
            System.out.println("4 - Проверить, положительное ли число");
            System.out.println("5 - Проверить, двузначное ли число");
            System.out.println("0 - ВЫХОД");
            System.out.println("Номер задачи (0 - 5): ");

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число от 0 до 5.");
                sc.next();
            }

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите вещественное число x: ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Ошибка! Введено не вещественное число.");
                    sc.next();
                }
                double doubleX = sc.nextDouble();
                System.out.println("Дробная часть числа x: " + lab.fraction(doubleX));
                break;

            case 2:
                System.out.println("Введите целое число x (не менее двух знаков): ");
                while (!sc.hasNextDouble()) {
                    System.out.println("Ошибка! Введите целое число.");
                    sc.next();
                }
                int intX1 = sc.nextInt();
                System.out.println("Результат: " + lab.sumLastNums(intX1));
                break;

            case 3:
                System.out.print("Введите один символ от '0' до '9': ");
                String input = sc.next();
                while (input.length() != 1 || input.charAt(0) < '0' || input.charAt(0) > '9') {
                    System.out.println("Ошибка! Введите ровно одну цифру.");
                    input = sc.next();
                }
                char charX = input.charAt(0);
                System.out.println("Результат: " + lab.charToNum(charX));
                break;

            case 4:
                System.out.print("Введите целое число x: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число.");
                    sc.next();
                }
                int intX2 = sc.nextInt();
                System.out.println("Результат: " + lab.isPositive(intX2));
                break;

            case 5:
                System.out.print("Введите целое число x: ");
                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число.");
                    sc.next();
                }
                int intX3 = sc.nextInt();
                System.out.println("Результат: " + lab.is2Digits(intX3));
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
