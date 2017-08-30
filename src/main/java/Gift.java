public abstract class Gift {
    public String name;
    public double weight;
    public double price;

    public abstract String specialProperty();

    public Gift(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Название: " + name
                + "\nЦена: " + price
                + "\nВес: " + weight
                + "\n" + specialProperty() + "\n";
    }

}
