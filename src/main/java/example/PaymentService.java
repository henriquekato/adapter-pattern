package example;

import java.math.BigDecimal;
import java.util.UUID;

public class PaymentService {

    public void debit(Client client, BigDecimal amount){
        client.debit(amount);
    }

    public void credit(Client client, BigDecimal amount){
        client.credit(amount);
    }
}
