public class Marmalade extends Gift {
    public String color;
    public Marmalade(String name, double weight, double price, String color) {
        super(name, weight, price);
        this.color = color;
    }
    @Override
    public String specialProperty() {
        return color;
    }
}
