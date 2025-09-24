public class Customer {
    String name = "";
    SuperMarket superMarket;

    public Customer(String name) {
        this.name = name;
    }

    public void goToSuperMarket (SuperMarket superMarket) {
        this.superMarket = superMarket;
    }


}



// Klasse:          Customer
//  Attributen:     name, supermarket
// Methodes:        constructor(name), goToSupermarket(supermarket), buyItem(productName, amount)