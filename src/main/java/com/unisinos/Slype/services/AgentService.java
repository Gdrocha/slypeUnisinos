package com.unisinos.Slype.services;

import com.unisinos.Slype.models.AgentModel;

import java.util.List;

public interface AgentService extends ModelService<AgentModel>{
    AgentModel findByEmail(String email);

    AgentModel findByEmailOrNull(String email);

    List<AgentModel> findAllAgents();
}
