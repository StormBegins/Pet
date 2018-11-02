package com.test.entity;

import com.test.onnontation.CellPhone;

public class Category {
    //@NotNull(message = "不能为空")
    @com.test.onnontation.Category
    @CellPhone
    private Integer id;

    //@NotEmpty(message = "不能为empty")

    private String name;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}