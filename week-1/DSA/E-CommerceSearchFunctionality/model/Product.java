package model;

public class Product {

    public int id;
    public String name;
    public String category;

    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Category : " + category);
    }
}