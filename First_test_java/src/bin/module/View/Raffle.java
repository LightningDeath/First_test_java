package bin.module.View;

import bin.module.Interface.i_View.i_Raffle;

import java.util.Random;
import java.util.Scanner;

public class Raffle implements i_Raffle {
    @Override
    public int raffle() {
        Scanner in = new Scanner(System.in);
        Random rn = new Random();
        int random = rn.nextInt(9);
        int choice = 0;
        int attempts = 4;
        for (int i = 0; i < 4; i++) {
            if (i != 0) {
                if (random > choice) {
                    System.out.println("\nПодсказка: загаданное число больше введенного Вами");
                } else {
                    System.out.println("\nПодсказка: загаданное число меньше введенного Вами");
                }
            }
            System.out.printf("Введите Ваше число(попыток осталось - %d): ", attempts);
            try {
                choice = in.nextInt();
            } catch (Exception e) {
                System.out.println("""
                        \nВведено не число!
                        Розыгрышь начнется заново.
                        """);
                return raffle();
            }
            if (choice == random) {
                System.out.println("\nВы угадали!");
                return attempts;
            }
            attempts--;
        }
        return 10;
    }
}
