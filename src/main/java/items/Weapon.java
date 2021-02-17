package items;

public class Weapon extends Item {

    private int powerRating;
    private int defenceRating;

    public Weapon(String name, int powerRating, int defenceRating) {
        super(name);
        this.powerRating = powerRating;
        this.defenceRating = defenceRating;
    }

    public int getDefenceRating() {
        return defenceRating;
    }

    public int getPowerRating() {
        return powerRating;
    }
}
