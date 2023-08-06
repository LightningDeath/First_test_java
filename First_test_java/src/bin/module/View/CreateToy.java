package bin.module.View;

import bin.module.Interface.i_View.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreateToy implements i_CreateToy {
    @Override
    public List<String> createToy() {
        Scanner in = new Scanner(System.in);
        List<String> list_param = new ArrayList<>();
        String id, name, quantity, weight;

        System.out.print("\nВведите id игрушки: ");
        id = in.nextLine();
        list_param.add(id);

        System.out.print("Введите название игрушки: ");
        name = in.nextLine();
        list_param.add(name);

        System.out.print("Введите количество таких игрушек: ");
        quantity = in.nextLine();
        list_param.add(quantity);

        System.out.print("Введите процент выпадения: ");
        weight = in.nextLine();
        list_param.add(weight);
        return list_param;
    }
}
