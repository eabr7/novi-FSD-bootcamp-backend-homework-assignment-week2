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

        if (productName == bread) {
            superMarket.buyBread(amount);
        } else if (productName == fruit) {
            superMarket.buyFruit(amount);
        } else if (productName == cheese) {
            superMarket.buyCheese(amount);
        } else if (productName == toiletPaper) {
            superMarket.buyToiletPaper(amount);
        }
    }
}