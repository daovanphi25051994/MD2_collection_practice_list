package product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ListProduct extends Product {
    LinkedList<Product> listProduct;

    public ListProduct() {
        listProduct = new LinkedList<>();
    }

    public boolean add(Product element) {
        listProduct.add(element);
        return true;
    }
    public void setProductById(int id){
        for (Product element : listProduct){
            if (element.getId() == id){
                element.inputData();
            }
        }
    }
    public Product removeProductById(int id){
        for (Product element : listProduct){
            if (element.getId() == id){
                Product removedElement = element;
                listProduct.remove(element);
                return removedElement;
            }
        }
        throw new UnsupportedOperationException("id not found");
    }
    @Override
    public void display(){
        for (Product element : listProduct){
            element.display();
        }
    }
    public void searchElementByName(String name){
        for (Product element : listProduct){
            if (element.getName().equals(name)){
                element.display();
            }
        }
    }
    public void sortAscendingByPrice(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                if (product.getPrice() > t1.getPrice()){
                    return 1;
                }else if (product.getPrice() < t1.getPrice()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }

    public void sortDecreaseByPrice(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
                if (product.getPrice() < t1.getPrice()){
                    return 1;
                }else if (product.getPrice() > t1.getPrice()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
    public void sortByName(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product product, Product t1) {
               return product.getName().compareTo(t1.getName());
            }
        });
    }
}
