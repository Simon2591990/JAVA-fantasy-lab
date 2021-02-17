package items;

public class Spell extends Item {
    private int powerRating;
    public Spell(String name, int powerRating) {
        super(name);
        this.powerRating = powerRating;
    }

    public int getPowerRating() {
        return powerRating;
    }
}
