package com.javarush.task.task14.task1417;

/**
 * Created by IzIFRag on 26.07.2017.
 */
public class Ruble extends Money {
    private double amount;
    @Override
    public double getAmount() {
        return amount;
    }

    public Ruble(double amount) {
        super(amount);
        this.amount = amount;

    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
