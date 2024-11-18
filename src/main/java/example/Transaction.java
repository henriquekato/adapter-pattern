package example;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Transaction {
    private final UUID id;
    private final Client payer;
    private final Client receiver;
    private final BigDecimal amount;

    public Transaction(Client payer, Client receiver, BigDecimal amount){
        this.id = UUID.randomUUID();
        this.payer = payer;
        this.receiver = receiver;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public UUID getId() {
        return id;
    }

    public Client getPayer() {
        return payer;
    }

    public Client getReceiver() {
        return receiver;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
