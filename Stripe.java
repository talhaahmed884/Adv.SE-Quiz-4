package com.cpp.quiz4;

public class Stripe {
    private final int paymentAmount;
    private final String cardholderName;
    private final String cardNumber;
    private final String expirationDate;

    public Stripe(int paymentAmount, String cardholderName, String cardNumber, String expirationDate) {
        this.paymentAmount = paymentAmount;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void processPayment() {
        System.out.println("Stripe payment processing:");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Making payment for amount: $" + paymentAmount + " with Card Holder Name: " + cardholderName + ", Card Number: " + cardNumber + ", Expiration Date: " + expirationDate;
    }
}
