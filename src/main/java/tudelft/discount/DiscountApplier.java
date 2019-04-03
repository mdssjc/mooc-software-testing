package tudelft.discount;

import java.math.BigDecimal;

public class DiscountApplier {

    private ProductDao dao;

    public DiscountApplier(ProductDao dao) {
        this.dao = dao;
    }

    public void setNewPrices() {

        for (Product product : dao.all()) {
            if (product.getCategory().equals("BUSINESS")) {
                product.setPrice(product.getPrice().multiply(BigDecimal.valueOf(0.9)));
            }
            if (product.getCategory().equals("HOME")) {
                product.setPrice(product.getPrice().multiply(BigDecimal.valueOf(1.1)));
            }
        }
    }
}
