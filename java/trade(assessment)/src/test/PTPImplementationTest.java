package test;

import com.bank.paris.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PTPImplementationTest {
     Product product;
     PTPImplementation ParisTradedProducts;
     ProductPricingService productPricingService;

    @BeforeEach
    void setUp() {
        ParisTradedProducts = new PTPImplementation();

        //mock product
        product = mock(Product.class);
        Mockito.when(product.getId()).thenReturn("1");

        //mock pricing
        productPricingService = mock(ProductPricingService.class);

        //mock stock
        Mockito.when(productPricingService.price(anyString(), anyString())).thenReturn(1.0);

        //mock future
        Mockito.when(productPricingService.price(anyString(), anyString(), anyInt(), anyInt())).thenReturn(2.0);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void assertThatProductsCanBeAddedAndDuplicates() throws ProductAlreadyRegisteredException {
        ParisTradedProducts.addNewProduct(product); // add product

        // duplicate product
        assertThrows(ProductAlreadyRegisteredException.class, () -> ParisTradedProducts.addNewProduct(product), "Duplicate Products");
    }

    @Test
    void assertThatProductsCanBeTradedElse() throws ProductAlreadyRegisteredException {
        ParisTradedProducts.addNewProduct(product); // add
        ParisTradedProducts.trade(product, 10); // trade
    }

    @Test
    void assertThatTotalTradeQuantityForDayIsValid() throws ProductAlreadyRegisteredException {
        ParisTradedProducts.addNewProduct(product); // add
        ParisTradedProducts.trade(product, 11); // trade

        Product product1 = mock(Product.class);
        when(product1.getId()).thenReturn("13");

        ParisTradedProducts.addNewProduct(product1);
        ParisTradedProducts.trade(product1, 5);

        assertEquals(16, ParisTradedProducts.totalTradeQuantityForDay(), "Total Trade Quantity Is Not Valid");
    }

    @Test
    void AssertThatTotalValueOfDaysTradedProductsIsValid() throws ProductAlreadyRegisteredException {
        Product stock = new Stocks("1", "Joseph", "TCL4", productPricingService);
        ParisTradedProducts.addNewProduct(stock);
        ParisTradedProducts.trade(stock, 3);

        Product future = new Futures("2", "Ita", "TCL4", 2, 8, productPricingService);
        ParisTradedProducts.addNewProduct(future);
        ParisTradedProducts.trade(future, 9);

        assertEquals(21, ParisTradedProducts.totalValueOfDaysTradedProducts(), "Total Value of Days Traded Is Not Valid");
    }
}