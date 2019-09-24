package com.javeriana.oms.dto;

import java.io.Serializable;

public class OrderDTO implements Serializable {

    private int id;
    private String description;

    public OrderDTO() {
    }

    public OrderDTO(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
