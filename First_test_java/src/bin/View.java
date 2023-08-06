package bin;
import bin.module.Toy;
import bin.module.View.*;

import java.util.ArrayDeque;
import java.util.List;

public class View {
    public List<String> createToy(){
        CreateToy ct = new CreateToy();
        return ct.createToy();
    }

    public int choice(){
        Choice ch = new Choice();
        return ch.choice();
    }

    public void info(String str){
        new Info().info(str);
    }

    public int raffle(){
        Raffle raf = new Raffle();
        return raf.raffle();
    }

    public int repeat(){
        return new Repeat().repeat();
    }

    public void viewIssuedToy(ArrayDeque<Toy> listPlayedToy){new ViewIssuedToy().viewIssuedToy(listPlayedToy);}

    public ArrayDeque<Toy> issuanceToy(ArrayDeque<Toy> listPlayedToy){return new IssuanceToy().issuanceToy(listPlayedToy);}
}
