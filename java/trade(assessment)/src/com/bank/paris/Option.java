package com.bank.paris;

public class Option extends Product {

    private String exchange;
    private String ticker;
    private int validityTime; // counted in days
    private String contractCode;
    private int month;
    private int year;
    private final ProductPricingService productPricingService;

    public Option(String id, ProductPricingService productPricingService) {
        super(id);
        this.productPricingService = productPricingService;
    }

    @Override
    public double getPrice() {
        return this.productPricingService.price(this.exchange, this.contractCode, this.month, this.year);
    }
}