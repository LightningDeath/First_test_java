package bin.module.View;

import bin.module.Interface.i_View.i_Info;

public class Info implements i_Info {
    @Override
    public void info(String str) {
        System.out.println(str);
    }
}
