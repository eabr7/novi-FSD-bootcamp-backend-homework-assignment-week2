import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product bread = new Product("bread", 3.45, 30);
        Product fruit = new Product("fruit", 0.35, 70);
        Product cheese = new Product("cheese", 2.20, 15);
        Product toiletPaper = new Product("toiletPaper", 4.50, 35);

        SuperMarket superMarket = new SuperMarket(bread, fruit, cheese, toiletPaper);
        Customer customer = new Customer("John");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which product do you want to buy?");
        String productName = scanner.nextLine();
        System.out.println("How many do you want to buy?");
        int amount = scanner.nextInt();

        customer.goToSuperMarket(superMarket);
        customer.buyItem(productName, amount);

    }


}


// Klasse:          Main
//  Attributen:     bread, fruit, cheese, toilerPaper, superMarket, customer, scanner, name, amount
//  Methodes:       main

