package controller;

import product.ListProduct;
import product.Product;

public class Controller {
    public static void main(String[] args) {
        ListProduct listProduct = new ListProduct();
        Product iphone = new Product(1, "iphone5", 5000000, 20);
        Product samSung = new Product(2, "sam sung 10", 10000000, 30);
        listProduct.add(iphone);
        listProduct.add(samSung);
        listProduct.display();
        listProduct.sortDecreaseByPrice();
        listProduct.display();
        listProduct.sortByName();
        listProduct.display();
    }
}
