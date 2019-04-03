package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

    @Test
    void test1() {
        Product p1 = new Product("P01", BigDecimal.valueOf(100), "BUSINESS");
        Product p2 = new Product("P02", BigDecimal.valueOf(100), "HOME");

        ProductDao mock = Mockito.mock(ProductDao.class);

        List<Product> products = Arrays.asList(p1, p2);
        Mockito.when(mock.all()).thenReturn(products);

        DiscountApplier discountApplier = new DiscountApplier(mock);
        discountApplier.setNewPrices();

        Assertions.assertEquals(BigDecimal.valueOf(90.0), p1.getPrice());
        Assertions.assertEquals(BigDecimal.valueOf(110.0), p2.getPrice());
    }
}
