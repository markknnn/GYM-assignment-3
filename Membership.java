package model;

public class Membership {

    private int id;
    private String type;
    private double price;
    private int durationMonths;

    public Membership(int id, String type, double price, int durationMonths) {
        setId(id);
        setType(type);
        setPrice(price);
        setDurationMonths(durationMonths);
    }

    public void setId(int id) {
        if (id <= 0)
            throw new IllegalArgumentException("Invalid membership ID");
        this.id = id;
    }

    public void setType(String type) {
        if (type == null || type.isEmpty())
            throw new IllegalArgumentException("Invalid membership type");
        this.type = type;
    }

    public void setPrice(double price) {
        if (price <= 0)
            throw new IllegalArgumentException("Invalid price");
        this.price = price;
    }

    public void setDurationMonths(int durationMonths) {
        if (durationMonths <= 0)
            throw new IllegalArgumentException("Invalid duration");
        this.durationMonths = durationMonths;
    }
}
