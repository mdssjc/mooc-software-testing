package tudelft.discount;

import java.math.BigDecimal;

public class Product {

    private String name;
    private BigDecimal price;
    private String category;

    public Product(String name, BigDecimal price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
