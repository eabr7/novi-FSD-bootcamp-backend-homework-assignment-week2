public class SuperMarket {
    Product bread;
    Product fruit;
    Product cheese;
    Product toiletPaper;

    public SuperMarket(Product bread, Product fruit, Product cheese, Product toiletPaper) {
        this.bread = bread;
        this.fruit = fruit;
        this.cheese = cheese;
        this.toiletPaper = toiletPaper;
    }

    private void buyItem(Product product, int amount) {
       double totalPrice = amount * product.price;

        if (amount <= product.amount) {
            product.amount = product.amount - amount;
            System.out.println("You bought " + amount + " " + product.name + " for " + totalPrice + " euro.");
        } else {
            System.out.println("You cannot buy " + amount + " " + product.name + " we only have " + product.amount + " " + product.name + " in stock.");
        }
    }

    public void buyBread (int amount) {
        buyItem(this.bread, amount);
    }

    public void buyFruit (int amount) {
        buyItem(this.fruit, amount);
    }

    public void buyCheese (int amount) {
        buyItem(this.cheese, amount);
    }

    public void buyToiletPaper (int amount) {
        buyItem(this.toiletPaper, amount);
    }
}