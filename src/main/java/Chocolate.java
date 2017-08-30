public class Chocolate extends Gift {
    public int percent;

    public Chocolate(String name, double weight, double price, int percent) {
        super(name, weight, price);
        this.percent = percent;
    }

    @Override
    public String specialProperty() {
        return "процент какао: " + percent;
    }
}
