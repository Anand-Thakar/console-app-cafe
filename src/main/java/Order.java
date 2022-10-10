import co.foodService.Cafe;

public class Order {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        try {
            cafe.menu();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            cafe.menu();
        }
    }
}
