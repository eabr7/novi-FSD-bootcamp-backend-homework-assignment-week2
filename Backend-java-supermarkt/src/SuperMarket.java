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
}




// Klasse:        SuperMarket
//  Attributen:   bread, fruit, cheese, toiletPaper
// Methodes:      constructor(bread, fruit, cheese, toiletPaper),buyBread(amount),
//                  buyFruit(amount),buycheese(amount), buyToilerPaper(amount),buyItem(product,amount)