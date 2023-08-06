package bin.module;

import java.util.List;

public class Toy {
    private final String id;
    private final String weight;
    private String quantity;
    private final String name;
    private String dateIssuance, raffleDay, rarity;

    public Toy(List<String> tl){
        this.id = tl.get(0);
        this.name = tl.get(1);
        this.quantity = tl.get(2);
        this.weight = tl.get(3);
    }

    public String getId() {
        return id;
    }

    public String getDateIssuance() {
        return dateIssuance;
    }

    public String getWeight() {
        return weight;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getRarity() {
        return rarity;
    }

    public String getRaffleDay() {
        return raffleDay;
    }

    public void setRaffleDay(String raffleDay) {
        this.raffleDay = raffleDay;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setDateIssuance(String dateIssuance) {
        this.dateIssuance = dateIssuance;
    }
}
