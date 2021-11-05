package com.bank.paris;

import java.util.*;

public class PTPImplementation implements ParisTradedProducts {
    private List<Product> productsList = new ArrayList<>();
    private Map<Product, Integer> tradedProductsMap = new HashMap<>();

    /**
     * Adds a new product to the system that
     * the class will track statistics for
     *
     * @param product add a product available for trading
     * @throws ProductAlreadyRegisteredException thrown
     *                                           when a product is registered twice
     */
    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if (productsList.stream()
                .anyMatch(x -> x.getId().equals(product.getId()))
        ) {
            throw new ProductAlreadyRegisteredException("Product Exists! \n"
                    + "ID: " + product.getId());
        }
       productsList.add(product);
    }

    /**
     * Books a quantity against the product traded. If the product
     * has not been registered, no quantity is recorded as
     * it is not a product we are required to track.
     *
     * @param product  the product traded
     * @param quantity the quantity traded
     */
    @Override
    public void trade(Product product, int quantity) {
        if (!productsList.contains(product)) { return; }
        if (tradedProductsMap.containsKey(product)) {
            int existingQuantity = tradedProductsMap.get(product);
            tradedProductsMap.put(product, existingQuantity + quantity);
        } else tradedProductsMap.put(product, quantity);
    }

    /**
     * Calculates the total quantity of all the registered
     * traded products so far today
     *
     * @return the total quantity traded
     */
    @Override
    public int totalTradeQuantityForDay() {
        int sum = 0;
        for (Integer x : this.tradedProductsMap.values()) {
            int i = x;
            sum += i;
        }
        return sum;
    }

    /**
     * Calculates the total value of all the registered traded products
     * so far today. This is done by multiplying the value by the quantity
     * traded.
     *
     * @return the total value of today's traded products that are
     * registered in the system
     */
    @Override
    public double totalValueOfDaysTradedProducts() {
        double sum = 0.0;
        for (Product x : this.tradedProductsMap.keySet()) {
            double v = x.getPrice() * tradedProductsMap.get(x);
            sum += v;
        }
        return sum;
    }
}
