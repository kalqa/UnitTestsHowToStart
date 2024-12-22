package pl.javaready.order;

public record Client(String email, String phoneNumber) {

    public Client {
        if (phoneNumber == null || phoneNumber.isBlank() || phoneNumber.length() != 9) {
            throw new IllegalArgumentException("Phone number cannot be null or blank or length different than 9");
        }
    }
}
