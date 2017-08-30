public class Main {
    public static void main(String[] args) {
        Gift chocolate = new Chocolate("Mars", 0.3, 35.0, 78);
        Gift candy = new Candy("Fruttis", 0.4, 275.1, true);
        Gift marmalade = new Marmalade("Барни", 0.25, 150.5, "Разноцветные");

        Present present = new Present(chocolate, candy, marmalade);

        System.out.println(present);
        System.out.println("Общая стоимость: " + present.getTotalPrice());
        System.out.println("Общий вес: " + present.getTotalWeight());
    }
}
