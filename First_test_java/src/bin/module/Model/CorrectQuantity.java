package bin.module.Model;

import bin.module.Interface.i_Model.i_CorrectQuantity;
import bin.module.Toy;

import java.util.List;

public class CorrectQuantity implements i_CorrectQuantity {
    @Override
    public List<Toy> correctQuantity(List<Toy> listToy, Toy raffledToy) {
        for (Toy t:listToy) {
            if (t.getId().equalsIgnoreCase(raffledToy.getId())){
                t.setQuantity(Integer.toString(Integer.parseInt(raffledToy.getQuantity()) - 1));
            }
        }
        return listToy;
    }
}
