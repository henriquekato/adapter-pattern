package example;

import example.exceptions.ClientNotFoundException;
import example.exceptions.InsufficientFundsException;

import java.math.BigDecimal;
import java.util.UUID;

public class StripeAdapter implements PaymentGateway {
    private final StripeAPI stripeAPI;

    public StripeAdapter(StripeAPI stripeAPI) {
        this.stripeAPI = stripeAPI;
    }

    @Override
    public void processPayment(UUID payerId, UUID receiverId, BigDecimal amount) {
        try{
            Transaction transaction = stripeAPI.authorize(payerId, receiverId, amount);
            stripeAPI.capture(transaction);
            stripeAPI.charge(amount);
        }
        catch (ClientNotFoundException | InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }
}
