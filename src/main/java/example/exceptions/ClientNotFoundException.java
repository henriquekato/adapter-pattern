package example.exceptions;

import java.util.UUID;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(UUID clientId){
        super("Client with id: " + clientId + " not found");
    }
}
