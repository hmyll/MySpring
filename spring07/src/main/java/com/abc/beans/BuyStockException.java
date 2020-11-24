package com.abc.beans;

public class BuyStockException extends Exception{
    public BuyStockException() {
    }

    public BuyStockException(String massage) {
        super(massage);
    }
}
