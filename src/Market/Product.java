package Market;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private double weight;



    public Product(String name, double price, double weight) {
        if (name != null && !name.isBlank() && !name.isEmpty() && price > 0 && weight > 0) {
            this.weight = weight;
            this.name = name;
            this.price = price;

        } else {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}

    public double getWeight() {return weight;}

    public void setWeight(double weight) {this.weight = weight;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product products = (Product) o;
        return Double.compare(products.price, price) == 0 && Double.compare(products.weight, weight) == 0 && Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, weight);
    }

    @Override
    public String toString() {
        return name + " || цена " + price + "₽" + " || вес: " + weight;
    }
}
