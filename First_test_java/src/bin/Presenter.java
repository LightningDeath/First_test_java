package bin;

import bin.module.Toy;
import bin.Model;
import bin.View;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;


import static java.lang.System.exit;


public class Presenter {
    View v;
    Model m;

    public Presenter() {
        this.v = new View();
        this.m = new Model();
    }

    public void run(List<Toy> listToy, ArrayDeque<Toy> listPlayedToy) throws IOException {
        int c = this.v.choice();
        int raf = 0;
        if (c == 1) {
            List<String> param_list = this.v.createToy();
            int clt = this.m.checkListToy(listToy, param_list);
            while (clt == 1 || clt == 2) {
                if (clt == 1) {
                    this.v.info("\nИгрушка с такими id уже существует! Повторите ввод.");
                } else {
                    this.v.info("\nНе верный процент! Должно быть число больше 1 и меньше, либо равно 100." +
                            "Повторите ввод.");
                }
                param_list = this.v.createToy();
                clt = this.m.checkListToy(listToy, param_list);
            }
            listToy = this.m.addToy(this.m.createToy(param_list), listToy);

        } else if (c == 2) {
            if (listToy.isEmpty()) {
                this.v.info("\nНет игрушек для проведения розыгрыша." +
                        "Добавьте игрушек.");
                run(listToy, listPlayedToy);
            }
            this.v.info("""
                    \nУгадайте число от нуля до 8 с четырех попыток!
                    Чем меньше попыток сделаете, тем ценнее игрушка!
                                         Удачи!
                    """);
            raf = this.v.raffle();
            while (raf == 10) {
                this.v.info("\nУпс! Вы не смогли угадать! Хотите повторить розыгрышь?");
                if (this.v.repeat() == 1) {
                    raf = this.v.raffle();
                } else {
                    this.v.info("\nВозврат в основное меню.");
                    run(listToy, listPlayedToy);
                }
            }
            Toy raffledToy = this.m.raffle(raf, listToy);
            listToy = this.m.correctQuantity(listToy, raffledToy);
            listPlayedToy.addFirst(raffledToy);

        } else if (c == 3) {
            if (listPlayedToy.isEmpty()) {
                this.v.info("\nНет игрушек для выдачи. Нужно выйграть хотя бы одну игрушку :)");
                run(listToy, listPlayedToy);
            }
            this.m.writePlayedToyFile(listPlayedToy.getFirst());
            listPlayedToy = this.v.issuanceToy(listPlayedToy);

        } else if (c == 4) {
            if (listPlayedToy.isEmpty()) {
                this.v.info("\nНет игрушек для отображения." +
                        "Проведите розыгрыш и победите!");
                run(listToy, listPlayedToy);
            }
            this.v.viewIssuedToy(listPlayedToy);

        } else if (c == 5) {
            System.out.println("\nВсего наилучшего!");
            exit(0);
        }

        this.v.info("\nЖелаете продолжить?");
        if (this.v.repeat() == 1){
            run(listToy,listPlayedToy);
        }else {
            System.out.println("\nВсего наилучшего!");
            exit(0);
        }
    }

}
