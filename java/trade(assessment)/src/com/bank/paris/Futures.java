package com.bank.paris;

public class Futures extends Product {
    private String exchange, contractCode;
    private int month, year;

    private final ProductPricingService  productPricingService;

    public Futures(String id, String exchange, String contractCode, int month, int year, ProductPricingService productPricingService) {
        super(id);
        this.exchange = exchange;
        this.contractCode = contractCode;
        this.month = month;
        this.year = year;
        this.productPricingService = productPricingService;
    }

    @Override
    public double getPrice() {
        return this.productPricingService.price(this.exchange, this.contractCode, this.month, this.year);
    }
}
