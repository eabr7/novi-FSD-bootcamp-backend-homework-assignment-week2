import java.util.Objects;

public class Customer {
    String name = "";
    SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSuperMarket(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    public void buyItem(String productName, int amount) {
        String bread = "bread";
        String fruit = "fruit";
        String cheese = "cheese";
        String toiletPaper = "toilet paper";

        if (Objects.equals(productName, bread)) {
            superMarket.buyBread(amount);
        } else if (Objects.equals(productName, fruit)) {
            superMarket.buyFruit(amount);
        } else if (Objects.equals(productName, cheese)) {
            superMarket.buyCheese(amount);
        } else if (Objects.equals(productName, toiletPaper)) {
            superMarket.buyToiletPaper(amount);
        }
    }
}

