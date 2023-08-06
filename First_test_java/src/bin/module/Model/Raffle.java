package bin.module.Model;

import bin.module.Interface.i_Model.i_Raffle;
import bin.module.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Raffle implements i_Raffle {
    @Override
    public Toy raffle(int attempts, List<Toy> listToy) {
        Random rn = new Random();
        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH:mm:ss ");
        String date = dateFormat.format(new Date());
        List<Toy> temp_list = new ArrayList<>();
        if (attempts == 4){
            for (Toy d:listToy) {
                if (Integer.parseInt(d.getWeight()) <= 25){
                    temp_list.add(d);
                }
            }
            if (temp_list.isEmpty()){
                for (Toy d:listToy) {
                    if (Integer.parseInt(d.getWeight()) <= 50){
                        temp_list.add(d);
                    }
                }
            }
            if (temp_list.isEmpty()){
                for (Toy d:listToy) {
                    if (Integer.parseInt(d.getWeight()) <= 100){
                        temp_list.add(d);
                    }
                }
            }
        } else if (attempts == 3) {
            for (Toy d:listToy) {
                if (Integer.parseInt(d.getWeight()) > 25 && Integer.parseInt(d.getWeight()) <= 50){
                    temp_list.add(d);
                }
            }
            if (temp_list.isEmpty()){
                for (Toy d:listToy) {
                    if (Integer.parseInt(d.getWeight()) <= 75){
                        temp_list.add(d);
                    }
                }
            }
            if (temp_list.isEmpty()){
                for (Toy d:listToy) {
                    if (Integer.parseInt(d.getWeight()) <= 100){
                        temp_list.add(d);
                    }
                }
            }
        } else if (attempts == 2){
            for (Toy d:listToy) {
                if (Integer.parseInt(d.getWeight()) > 50 && Integer.parseInt(d.getWeight()) <= 75){
                    temp_list.add(d);
                }
            }
            if (temp_list.isEmpty()){
                for (Toy d:listToy) {
                    if (Integer.parseInt(d.getWeight()) <= 100){
                        temp_list.add(d);
                    }
                }
            }
        } else if (attempts == 1) {
            for (Toy d:listToy) {
                if (Integer.parseInt(d.getWeight()) > 75 && Integer.parseInt(d.getWeight()) <= 100){
                    temp_list.add(d);
                }
            }
        }
        int a = rn.nextInt(temp_list.size());
        temp_list.get(a).setRaffleDay(date);
        temp_list.get(a).setRarity(Integer.toString(attempts));
        return temp_list.get(a);
    }
}
