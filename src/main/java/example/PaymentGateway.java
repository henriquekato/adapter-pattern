package example;

import java.math.BigDecimal;
import java.util.UUID;

public interface PaymentGateway {
    void processPayment(UUID payerId, UUID receiverId, BigDecimal amount);
}
