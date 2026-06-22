package FactoryMethodPattern;

public class DocumentFactory {

    public Document createDocument(String type) {

        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        }

        if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        }

        if (type.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        }

        return null;
    }
}