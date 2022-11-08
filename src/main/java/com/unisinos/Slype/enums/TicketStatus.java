package com.unisinos.Slype.enums;

import java.util.Arrays;

public enum TicketStatus {
    OPEN("open", "Ticket opened"),
    CLOSED("closed", "Ticket closed"),
    SUSPENDED("suspended", "Ticket Suspended"),
    WAITING_ON_CUSTOMER("waiting on customer", "Waiting on customer reply");

    private final String name;
    private final String description;


    TicketStatus(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public static TicketStatus getByName(final String name) {
        return Arrays.stream(TicketStatus.values())
                .filter(status -> status.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
