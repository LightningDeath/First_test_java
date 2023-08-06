package bin.module.View;


import bin.module.Interface.i_View.i_Choice;

import java.util.Scanner;

public class Choice implements i_Choice {
    @Override
    public int choice() {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                \nВыберите действие:
                1 - Добавить игрушку;
                2 - Провести розыгрыш;
                3 - Выдать игрушку;
                4 - Показать все разыгранные игрушки, ожидающие выдачи;
                5 - Выход из программы.
                """);
        int c = 0;
        System.out.print("--> ");
        try {
            c = in.nextInt();
        } catch (Exception e) {
            System.out.println("\nВведен не корректный параметр! попробуйте еще.");
        }
        if (!(c >= 1 && c <= 5)) {
            System.out.println("\nВведен не верный параметр! Попробуйте еще.");
            return choice();
        }
        return c;
    }
}
