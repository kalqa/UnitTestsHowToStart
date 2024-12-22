package pl.javaready.order;

public class ClientService {

    public Client register(String email, String phoneNumber) {
        // validate, save to databse/ check database
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email address must contain @");
        }
        return new Client(email, phoneNumber);
    }
}
