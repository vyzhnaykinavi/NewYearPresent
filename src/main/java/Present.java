public class Present {
    public Gift[] gifts;

    public Present(Gift... gifts) {
        this.gifts = gifts;
    }

    public double getTotalWeight() {
        double sum = 0;
        for (Gift gift : gifts) {
            sum += gift.weight;
        }
        return sum;
    }

    public double getTotalPrice() {
        double sum = 0;
        for (Gift gift : gifts) {
            sum += gift.price;
        }
        return sum;
    }
    @Override
    public String toString() {
        String result = "";
        for (Gift gift : gifts) {
            result += "\n"+gift;
        }
        return result;
    }
}
