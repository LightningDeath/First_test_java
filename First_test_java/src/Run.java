import bin.Presenter;
import bin.module.Toy;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) throws IOException {
        System.out.println("\nДобро пожаловать в розыгрыш игрушек!");
        Presenter pr = new Presenter();
        List<Toy> listToy = new ArrayList<>();
        ArrayDeque<Toy> listPlayedToy = new ArrayDeque<>();
        pr.run(listToy, listPlayedToy);
    }
}