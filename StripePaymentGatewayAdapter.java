package com.cpp.quiz4;

public class StripePaymentGatewayAdapter implements PaymentGateway {
    private final Stripe stripe;

    public StripePaymentGatewayAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void makePayment() {
        this.stripe.processPayment();
    }
}
