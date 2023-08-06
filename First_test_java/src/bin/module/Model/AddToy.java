package bin.module.Model;

import bin.module.Interface.i_Model.i_AddToy;
import bin.module.Toy;

import java.util.List;

public class AddToy implements i_AddToy {
    @Override
    public List<Toy> addToy(Toy toy, List<Toy> listToy) {
        listToy.add(toy);
        return listToy;
    }
}
