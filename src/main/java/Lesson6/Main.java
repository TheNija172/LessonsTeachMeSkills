package Lesson6;


/*
Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            //firstTask();
            secondTask(scanner);
        }
    }

    //-----Task 1----
    public static void firstTask(){
        CreditCard card1 = new CreditCard(1111, 185.5);
        CreditCard card2 = new CreditCard(2222, 72.3);
        CreditCard card3 = new CreditCard(3333, 234.9);

        System.out.println("Счета до изменений:");
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        System.out.println("Счета после изменений:");
        card1.increaseBalance(14.5);
        card2.reduceBalace(22.3);
        card3.reduceBalace(250);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
    }

    //-----Task 2-----
    public static void secondTask(Scanner scanner)
    {
        ATM atm = new ATM(0, 0, 0);
        atm.increaseAmount(10, 20, 50);
        System.out.print("Введите сумму для снятия наличных: ");
        if (atm.decreaseAmount(checkInt(scanner)))
            System.out.println("Успешное снятие");
        else
            System.out.println("Недостаточно купюр");
        System.out.println(atm);
    }

    public static int checkInt(Scanner scanner){
        int number;
        while (!scanner.hasNextInt() || (number = scanner.nextInt()) < 0)
        {
            System.out.print("Неверный ввод: ");
            scanner.next();
        }

        return number;
    }
}
