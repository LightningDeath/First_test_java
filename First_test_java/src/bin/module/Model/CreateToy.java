package bin.module.Model;

import bin.module.Interface.i_Model.i_CreateToy;
import bin.module.Toy;

import java.lang.reflect.Array;
import java.util.List;

public class CreateToy implements i_CreateToy {
    @Override
    public Toy createToy(List<String> list_param) {
        return new Toy(list_param);
    }

}
