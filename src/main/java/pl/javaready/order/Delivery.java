package pl.javaready.order;

import java.util.UUID;

public record Delivery(String companyName, UUID parcelLockerId) {
}
