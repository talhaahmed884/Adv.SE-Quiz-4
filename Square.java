package com.cpp.quiz4;

public class Square {
    private final int paymentAmount;
    private final String locationID;

    public Square(int paymentAmount, String locationID) {
        this.paymentAmount = paymentAmount;
        this.locationID = locationID;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public String getLocationID() {
        return locationID;
    }

    public void processPayment() {
        System.out.println("Square payment processing:");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Making payment for amount: $" + paymentAmount + " with Location: " + locationID;
    }
}
