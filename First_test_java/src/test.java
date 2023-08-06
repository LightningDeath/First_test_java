import bin.module.Toy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.System.exit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
//    public static void ter(String a, int b) {
//        List<fak> listik = new ArrayList<>();
//        Run r = new Run();
//        r.fak(f);
//        for (int i = 0; i < 5; i++) {
//            fak f = new fak(a, b);
//            listik.add(f);
//        for (fak fak : listik) {
//            System.out.println("\n");
//            System.out.println(fak.getA());
//            System.out.println(fak.getV());
//        }
//        }
//        System.out.println(Arrays.toString(listik.toArray()));
//        for (fak f:listik) {
//
//        }
//    }

    public static void main(String[] args) {
        List<String> toy = new ArrayList<>(Arrays.asList("1234567", "Fanky", "4", "30"));

        //String a = "1508416";
        //a = String.valueOf(a.hashCode());
        //System.out.println(a);
//        String b = in.nextLine();
//        if (b.hashCode() == 1508416) {
//            System.out.println("Good");
//        } else {
//            System.out.println("not good");
//        }


//        Toy toy1 = new Toy(toy);
//        DateFormat dateFormat = new SimpleDateFormat("EEE, d MMM yyyy, HH.mm.ss ");
//        String date = dateFormat.format(new Date());
//        toy1.setDateIssuance(date);
//        toy1.setRaffleDay(date);
//        toy1.setRarity("3");
//        String path = new File("").getAbsolutePath() + "\\src\\Data\\IssuedToy.txt";
//        try (FileWriter fw = new FileWriter(path, true)) {
//            fw.write("\n----------------------------------------------\n");
//            fw.write("\nДата розыгрыша игрушки: " + toy1.getRaffleDay());
//            fw.write("\nДата выдачи игрушки: " + toy1.getDateIssuance());
//            fw.write("\nid ишрушки: " + toy1.getId());
//            fw.write("\nНазвание игрушки: " + toy1.getName());
//            if (toy1.getRarity().equalsIgnoreCase("3")) {
//                fw.write("\nРедкость игрушки: необычная\n");
//            }
//            fw.write("\n----------------------------------------------");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
        ArrayDeque<String> listPlayedToy = new ArrayDeque<>();
        listPlayedToy.addFirst("adfaf");
        listPlayedToy.add("124");
        listPlayedToy.addLast("124");
        System.out.println(listPlayedToy.getFirst());
        System.out.println("\n");
        for (String t:listPlayedToy) {
            System.out.println(t);
        }
        System.out.println("\n");
        System.out.println(listPlayedToy.pop());
        System.out.println("\n");
        for (String t:listPlayedToy) {
            System.out.println(t);
        }
    }
}
