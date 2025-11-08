package com.cpp.quiz4;

public class PayPal {
    private final int paymentAmount;
    private final String userEmail;

    public PayPal(int paymentAmount, String userEmail) {
        this.paymentAmount = paymentAmount;
        this.userEmail = userEmail;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void processPayment() {
        System.out.println("PayPal payment processing:");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Making payment for Amount: $" + paymentAmount + " with User Email: " + userEmail;
    }
}
