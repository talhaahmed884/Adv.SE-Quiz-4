package com.cpp.quiz4;

public class Driver {
    public static void main(String[] args) {
//        Stripe payment gateway
        PaymentGateway paymentGateway = new StripePaymentGatewayAdapter(new Stripe(1000,
                "Mike Harris", "4242424242424242", "01/01/2030"));
        paymentGateway.makePayment();
        System.out.println();

//        PayPal payment gateway
        paymentGateway = new PayPalPaymentGatewayAdapter(new PayPal(100,
                "mikeHarris123@gmail.com"));
        paymentGateway.makePayment();
        System.out.println();

//        Square payment gateway
        paymentGateway = new SquarePaymentGatewayAdapter(new Square(250,
                "1455 Market Street, San Francisco, CA 94103"));
        paymentGateway.makePayment();
        System.out.println();
    }
}