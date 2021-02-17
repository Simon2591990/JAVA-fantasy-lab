package items;

public class HealingTool extends Item {

    private int powerRating;
    public HealingTool(String name, int powerRating) {
        super(name);
        this.powerRating = powerRating;
    }

    public int getPowerRating() {
        return powerRating;
    }
}
