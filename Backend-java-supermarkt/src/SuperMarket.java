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

    public void buyItem(Product product, int amount) {
       double totalPrice = amount * product.price;

        if (amount <= product.amount) {
            product.amount = product.amount - amount;
            System.out.println("You bought " + amount + " " + product.name + " for " + totalPrice + " euro.");
        } else {
            System.out.println("You cannot buy " + amount + " " + product.name + " we only have " + product.amount + " " + product.name + " in stock.");
        }
    }
}




// Klasse:        SuperMarket
//  Attributen:   bread, fruit, cheese, toiletPaper
// Methodes:      constructor(bread, fruit, cheese, toiletPaper),buyBread(amount),
//                  buyFruit(amount),buycheese(amount), buyToilerPaper(amount),buyItem(product,amount)