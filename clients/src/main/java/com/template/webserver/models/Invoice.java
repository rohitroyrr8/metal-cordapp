package com.template.webserver.models;

import java.util.Date;

public class Invoice {
    private String identifier;
    private Double amount;
    private Date requestedOn;
    private Date paidOn;
    private String status;

    public Invoice(String identifier, Double amount, Date requestedOn, Date paidOn, String status) {
        this.identifier = identifier;
        this.amount = amount;
        this.requestedOn = requestedOn;
        this.paidOn = paidOn;
        this.status = status;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Double getAmount() {
        return amount;
    }

    public Date getRequestedOn() {
        return requestedOn;
    }

    public Date getPaidOn() {
        return paidOn;
    }

    public String getStatus() {
        return status;
    }
}
