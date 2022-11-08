package com.unisinos.Slype.services.impl;

import com.unisinos.Slype.models.AgentModel;
import com.unisinos.Slype.services.AbstractUserService;
import com.unisinos.Slype.services.AgentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgentServiceImpl extends AbstractUserService implements AgentService {
    @Override
    public AgentModel findByEmail(String email) {
        return null;
    }

    @Override
    public AgentModel findByEmailOrNull(String email) {
        return null;
    }

    @Override
    public List<AgentModel> findAllAgents() {
        return null;
    }

    @Override
    public List<AgentModel> findAll() {
        return null;
    }

    @Override
    public AgentModel findById(long id) {
        return null;
    }

    @Override
    public AgentModel save(AgentModel model) {
        return null;
    }

    @Override
    public void delete(AgentModel model) {

    }
}
