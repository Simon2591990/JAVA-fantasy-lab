package items;

public abstract class Item {
    private String name;
    private int powerRating;

    public Item(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

}
