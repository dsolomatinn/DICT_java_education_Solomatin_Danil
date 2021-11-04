package nix.java.education.chatbot;

import java.util.Scanner;

public class Chatbot {
    public static void main (String[] args) {
        //STAGE1
        String bot_name = "Алиса";
        int birth_day = 12;
        int birth_month = 10;
        int birth_year = 2021;
        System.out.println("Привет, меня зовут " + bot_name);
        System.out.println("Я была создана " + birth_day + "." + birth_month + "." + birth_year);
        Scanner scanner = new Scanner(System.in);
        //STAGE2
        System.out.println("Как тебя зовут?");
        String name = scanner.nextLine();
        System.out.println("Какое красивое имя" + ", " + name);
        //STAGE3
        System.out.println("Давай я попробую угадать твой возраст.Напиши остаток от деления твоего возраста на числа 3,5,7");
        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();
        int age;
        age = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;
        System.out.println("Твой возраст - " + age);
        //STAGE4
        System.out.println("Введи любое число и я посчитаю до него:");
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "!");
        }
        //STAGE5
        System.out.println("Давай проверим твои знания в програмировании. Я задам тебе вопрос, а ты выберешь праильный вариант ответа");
        System.out.println("Вопрос: Какой тип данных используется для символов?");
        System.out.println("1.Char");
        System.out.println("2.String");
        System.out.println("3.Integer");
        System.out.println("4.Float");
        System.out.println("Твой ответ(вводи число):");
        while (true) {
            String answer = scanner.next();
            if (answer.equals("1")) {
                System.out.println("Вы правы");
                System.out.println("Досвидания, хорошего дня " + ", " + name);
                break;
            } else {
                System.out.println("Попробуйте еще раз");
            }
        }
    }
}