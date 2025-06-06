import model.Apple;
import model.Food;
import model.Meat;
import model.constant.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(1, 500.0);
        Apple redApple = new Apple(10, 150.0, Colour.RED);
        Apple greenApple = new Apple(5, 120.0, Colour.GREEN);

        Food[] items = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(items);

        System.out.printf("Общая сумма товаров в корзине без скидки: %s%n", cart.getTotalPrice());
        System.out.printf("Общая сумма товаров в корзине со скидкой: %s%n", cart.getDiscountPrice());
        System.out.printf("Общая сумма всех вегетарианских продуктов в корзине без скидки: %s%n", cart.getVegetarianPrice());
    }
}
