package example.exceptions;

import java.util.UUID;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(UUID clientId){
        super("Insufficient funds for client with id: " + clientId);
    }
}
