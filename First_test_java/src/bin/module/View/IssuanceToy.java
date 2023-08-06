package bin.module.View;

import bin.module.Interface.i_View.i_IssuanceToy;
import bin.module.Toy;

import java.util.ArrayDeque;

public class IssuanceToy implements i_IssuanceToy {
    @Override
    public ArrayDeque<Toy> issuanceToy(ArrayDeque<Toy> listPlayedToy) {
        Toy toy = listPlayedToy.pop();
        String s = "";
        if (Integer.parseInt(toy.getWeight()) >= 1 && Integer.parseInt(toy.getWeight()) <= 25){
            s = "очень редкая";
        } else if (Integer.parseInt(toy.getWeight()) > 25 && Integer.parseInt(toy.getWeight()) <= 50) {
            s = "редкая";
        } else if (Integer.parseInt(toy.getWeight()) > 50 && Integer.parseInt(toy.getWeight()) <= 75) {
            s = "необычная";
        } else if (Integer.parseInt(toy.getWeight()) > 75 && Integer.parseInt(toy.getWeight()) <= 100) {
            s = "обычная";
        }
        System.out.println("\nВыдача игрушки:");
        System.out.println("id игрушки: " + toy.getId());
        System.out.println("Название игрушки: " + toy.getName());
        System.out.println("Редкость игрушки: " + s + "\n");
        return listPlayedToy;
    }
}
