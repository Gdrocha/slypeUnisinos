package com.unisinos.Slype.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.MappedSuperclass;

@EqualsAndHashCode(callSuper = true)
@MappedSuperclass
@Data
@DiscriminatorColumn(name = "REF_TYPE")
public abstract class UserModel extends Model {
    @Column(unique = true)
    private String email;
    private String name;
    private String password;

    public UserModel(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    public UserModel(String email) {
        this.email = email;
    }

    public UserModel() {
    }
}