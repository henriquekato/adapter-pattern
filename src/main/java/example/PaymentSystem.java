package example;

import example.exceptions.ClientNotFoundException;
import example.exceptions.InsufficientFundsException;

import java.math.BigDecimal;
import java.util.UUID;

public class PaymentSystem {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        ClientService clientService = new ClientService();
        StripeAPI stripeAPI = new StripeAPI(paymentService, clientService);
        PaymentGateway stripePayment = new StripeAdapter(stripeAPI);
        stripePayment.processPayment(UUID.randomUUID(), UUID.randomUUID(), BigDecimal.TWO);
    }
}
