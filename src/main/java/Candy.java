public class Candy extends Gift {
    private boolean isGum;

    public Candy(String name, double weight, double price, boolean isGum) {
        super(name, weight, price);
        this.isGum = isGum;
    }

    @Override
    public String specialProperty() {
        return (isGum ? "" : "не ") + "жевательная конфета";
    }
}
