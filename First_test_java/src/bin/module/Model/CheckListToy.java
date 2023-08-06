package bin.module.Model;

import bin.module.Interface.i_Model.i_CheckListToy;
import bin.module.Toy;

import java.util.List;

public class CheckListToy implements i_CheckListToy {
    @Override
    public int checkListToy(List<Toy> listToy, List<String> param) {
        for (Toy t: listToy) {
            if (t.getId().equalsIgnoreCase(param.get(0)) || t.getName().equalsIgnoreCase(param.get(1))){
                return 1;
            } else if (!(Integer.parseInt(param.get(3)) >= 1 && Integer.parseInt(param.get(3)) <= 100)) {
                return 2;
            }
        }
        return 0;
    }
}
