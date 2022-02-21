package com.company;

public class LimitException extends Exception{

    double remainingAmount;
    public LimitException(String message, double remainingAmount) {
        super(message);
        remainingAmount = remainingAmount;
    }

    public LimitException(double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }
}
