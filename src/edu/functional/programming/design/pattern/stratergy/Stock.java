package edu.functional.programming.design.pattern.stratergy;

public class Stock {
    private String name;
    private Double price;
    private Double units;

    public Stock(String name, Double price, Double units) {
        this.name = name;
        this.price = price;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", units=" + units +
                '}';
    }
}
