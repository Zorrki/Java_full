package seminar01.Task01;
// Задание №1
// 📌 Написать программу, которая запросит пользователя ввести
// <Имя> в консоли.
// 📌 Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

import java.util.Scanner;

public class InsertName {

    public static void main(String[] args) {
        System.out.print("Введите имя: ");
        Scanner inputScanner = new Scanner(System.in, "ibm866");
        String name = inputScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        inputScanner.close();
    }
}