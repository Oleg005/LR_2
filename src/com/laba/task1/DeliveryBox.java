package com.laba.task1;


import java.time.LocalDate;

public class DeliveryBox extends CubeBox {
    private final String address;
    private final String recipient;
    private final LocalDate departureDate;
    {
        departureDate = LocalDate.now();
    }


    public DeliveryBox(String address, String recipient) {
        this.address = address;
        this.recipient = recipient;
    }

    public String getAddress() {
        return address;
    }

    public String getRecipient() {
        return recipient;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }
}
