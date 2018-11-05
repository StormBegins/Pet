package com.contact.entity;

import java.util.Date;

public class PetOrder {
    private Integer id;

    private Integer petid;

    private Integer quantity;

    private Date shipdate;

    private String status;

    private byte[] complete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPetid() {
        return petid;
    }

    public void setPetid(Integer petid) {
        this.petid = petid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Date getShipdate() {
        return shipdate;
    }

    public void setShipdate(Date shipdate) {
        this.shipdate = shipdate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public byte[] getComplete() {
        return complete;
    }

    public void setComplete(byte[] complete) {
        this.complete = complete;
    }
}