package com.bank.paris;

public class Stocks extends Product {
    private String ticker, exchange;
    private final ProductPricingService productPricingService;

    public Stocks(String id, String ticker, String exchange, ProductPricingService productPricingService) {
        super(id);
        this.exchange = exchange;
        this.ticker = ticker;
        this.productPricingService = productPricingService;
    }

    @Override
    public double getPrice() {
        return this.productPricingService.price(this.exchange, this.ticker);
    }
}
