package com.example.jusantestbot.Service;

import lombok.Getter;

@Getter
public enum Command {
    ADMIN_TIME(1, "⌚ Show bot server time"),
    ADMIN_AUDIT(2, "\uD83D\uDEC3 Audit"),
    ADMIN_RELOAD_DATA(4, "\uD83D\uDD03 Data reloading"),
    REGISTER,
    SUBSCRIBE,
    UNSUBSCRIBE,
    HELP,
    START;

    private final String description;
    private final Integer order;

    Command() {
        this.description = "";
        this.order = Integer.MAX_VALUE;
    }

    Command(Integer order, String description) {
        this.description = description;
        this.order = order;
    }

    @Override
    public String toString() {
        return "/" + this.name();
    }
}
