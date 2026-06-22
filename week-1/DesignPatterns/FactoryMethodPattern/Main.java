package FactoryMethodPattern;

public class Main {

    public static void main(String[] args) {

        DocumentFactory factory = new DocumentFactory();

        Document word = factory.createDocument("word");
        Document pdf = factory.createDocument("pdf");
        Document excel = factory.createDocument("excel");

        System.out.println("Factory Method Pattern");

        word.open();
        pdf.open();
        excel.open();
    }
}