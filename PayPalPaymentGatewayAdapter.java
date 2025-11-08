package com.cpp.quiz4;

public class PayPalPaymentGatewayAdapter implements PaymentGateway {
    private final PayPal payPal;

    public PayPalPaymentGatewayAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void makePayment() {
        this.payPal.processPayment();
    }
}
