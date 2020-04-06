package product;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private int amount;

    public Product() {
    }

    public Product(int id, String name, int price, int amount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id : ");
        this.id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name : ");
        this.name = scanner.nextLine();
        System.out.println("Enter price : ");
        this.price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter amount : ");
        this.amount = scanner.nextInt();
        scanner.nextLine();
    }

    public void display() {
        System.out.printf("%-10d%-20s%-10.0f%-10d\n", this.id, this.name,this.price, this.amount);
    }
}
