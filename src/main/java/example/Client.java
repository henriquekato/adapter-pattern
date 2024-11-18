package example;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.UUID;

public class Client {
    private final UUID id;
    private BigDecimal balance;

    public Client(BigDecimal balance) {
        this.id = UUID.randomUUID();
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public UUID getId() {
        return id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void debit(BigDecimal amount){
        balance = balance.add(amount);
    }

    public void credit(BigDecimal amount){
        balance = balance.subtract(amount);
    }
}
