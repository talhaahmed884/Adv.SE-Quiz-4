package com.cpp.quiz4;

public class SquarePaymentGatewayAdapter implements PaymentGateway {
    private final Square square;

    public SquarePaymentGatewayAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void makePayment() {
        this.square.processPayment();
    }
}
