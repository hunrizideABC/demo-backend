package com.shop.myapp.dto;

import lombok.Setter;

import java.io.Serializable;


public class ProjectDTO implements Serializable {
    private long id;
    private String name;
    private String field;

    public ProjectDTO() {
    }

    public ProjectDTO(long id, String name, String field) {
        this.id = id;
        this.name = name;
        this.field = field;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setField(String field) {
        this.field = field;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return field;
    }
}
