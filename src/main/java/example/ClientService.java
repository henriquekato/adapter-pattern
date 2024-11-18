package example;

import java.math.BigDecimal;
import java.util.UUID;

public class ClientService {
    public Client getClientById(UUID id){
        return new Client(BigDecimal.valueOf(5));
    }
}
