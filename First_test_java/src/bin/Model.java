package bin;
import bin.module.Model.*;
import bin.module.Toy;

import java.io.IOException;
import java.util.List;

public class Model {

    public Toy createToy(List<String> list_param){
        return new CreateToy().createToy(list_param);
    }

    public List<Toy> addToy(Toy toy, List<Toy> listToy){
        return new AddToy().addToy(toy, listToy);
    }

    public Toy raffle(int attempts, List<Toy> listToy){
        return new Raffle().raffle(attempts, listToy);
    }
    public List<Toy> correctQuantity(List<Toy> listToy, Toy raffledToy){
        return new CorrectQuantity().correctQuantity(listToy, raffledToy);
    }
    public int checkListToy(List<Toy> listToy, List<String> param){
        return new CheckListToy().checkListToy(listToy, param);
    }
    public void writePlayedToyFile(Toy toy) throws IOException {
        WriteIssuedToyFile wpt = new WriteIssuedToyFile();
        wpt.writeIssuedToyFile(toy);
    }
}
