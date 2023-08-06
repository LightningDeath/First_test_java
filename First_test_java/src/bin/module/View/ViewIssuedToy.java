package bin.module.View;

import bin.module.Interface.i_View.i_ViewIssuedToy;
import bin.module.Toy;

import java.util.ArrayDeque;

public class ViewIssuedToy implements i_ViewIssuedToy {
    @Override
    public void viewIssuedToy(ArrayDeque<Toy> listPlayedToy) {
        for (Toy t: listPlayedToy) {
            String s = "";
            if (Integer.parseInt(t.getWeight()) >= 1 && Integer.parseInt(t.getWeight()) <= 25){
                s = "очень редкая";
            } else if (Integer.parseInt(t.getWeight()) > 25 && Integer.parseInt(t.getWeight()) <= 50) {
                s = "редкая";
            } else if (Integer.parseInt(t.getWeight()) > 50 && Integer.parseInt(t.getWeight()) <= 75) {
                s = "необычная";
            } else if (Integer.parseInt(t.getWeight()) > 75 && Integer.parseInt(t.getWeight()) <= 100) {
                s = "обычная";
            }
            System.out.println("\nДата розыгрыша игрушки: " + t.getRaffleDay());
            System.out.println("id ишрушки: " + t.getId());
            System.out.println("Название игрушки: " + t.getName());
            System.out.println("Редкость игрушки: " + s);
        }
    }
}
