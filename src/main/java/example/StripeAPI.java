package example;

import example.exceptions.ClientNotFoundException;
import example.exceptions.InsufficientFundsException;

import java.math.BigDecimal;
import java.util.UUID;

public class StripeAPI {
    private final PaymentService paymentService;
    private final ClientService clientService;
    public StripeAPI(PaymentService paymentService, ClientService clientService) {
        this.paymentService = paymentService;
        this.clientService = clientService;
    }

    Transaction authorize(UUID payerId, UUID receiverId, BigDecimal amount){
        Client payer = clientService.getClientById(payerId);
        Client receiver = clientService.getClientById(receiverId);
        if (payer == null) throw new ClientNotFoundException(payerId);
        if (receiver == null) throw new ClientNotFoundException(receiverId);
        if (payer.getBalance().compareTo(amount) < 0) throw new InsufficientFundsException(payerId);
        return new Transaction(payer, receiver, amount);
    }

    void capture(Transaction transaction){
        paymentService.debit(transaction.getPayer(), transaction.getAmount());
        paymentService.credit(transaction.getReceiver(), transaction.getAmount());
    }

    void charge(BigDecimal amount) {
        System.out.println("Payment of $" + amount + " processed via Stripe.");
    }
}
