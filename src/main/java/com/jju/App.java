
package com.jju;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PaymentMethod> payments = new ArrayList<>();

        payments.add(new CreditCard("1234-5678-9012-3456"));
        payments.add(new PayPal("hamduedris99@gmail.com"));

        for (PaymentMethod payment : payments) {
            payment.processPayment(99.99);
        }
    }
}