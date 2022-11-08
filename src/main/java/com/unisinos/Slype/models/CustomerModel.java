package com.unisinos.Slype.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "tb_customer")
public class CustomerModel extends UserModel{
    public CustomerModel(String email, String name, String password) {
        super(email, name, password);
    }

    public CustomerModel(String email) {
        super(email);
    }

    public CustomerModel() {
        super();
    }
}
