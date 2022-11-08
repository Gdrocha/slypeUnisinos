package com.unisinos.Slype.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "tb_agent")
public class AgentModel extends UserModel {
    private String groups;

    public AgentModel(String email, String name, String password) {
        super(email, name, password);
    }

    public AgentModel(String email) {
        super(email);
    }

    public AgentModel() {
        super();
    }
}