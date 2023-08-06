package bin.module.Model;

import bin.module.Interface.i_Model.i_WriteIssuedToyFile;
import bin.module.Toy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIssuedToyFile implements i_WriteIssuedToyFile {
    @Override
    public void writeIssuedToyFile(Toy toy) {
        String path = new File("").getAbsolutePath() + "\\src\\Data\\IssuedToy.txt";
        String s = "";
        if (toy.getRarity().equalsIgnoreCase("4")) {
            s = "обычная";
        } else if (toy.getRarity().equalsIgnoreCase("3")) {
            s = "необычная";
        } else if (toy.getRarity().equalsIgnoreCase("2")) {
            s = "редкая";
        } else if (toy.getRarity().equalsIgnoreCase("1")) {
            s = "очень редкая";
        }
        String newS = "\nРедкость игрушки: " + s + "\n";
        try (FileWriter fw = new FileWriter(path, true)) {
            fw.write("\n----------------------------------------------\n");
            fw.write("\nДата розыгрыша игрушки: " + toy.getRaffleDay());
            fw.write("\nДата выдачи игрушки: " + toy.getDateIssuance());
            fw.write("\nid ишрушки: " + toy.getId());
            fw.write("\nНазвание игрушки: " + toy.getName());
            fw.write(newS);
            fw.write("\n----------------------------------------------");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
