package com.unisinos.Slype.services.impl;

import com.unisinos.Slype.dto.request.UserRequestDTO;
import com.unisinos.Slype.exceptions.ModelNotFoundException;
import com.unisinos.Slype.models.AgentModel;
import com.unisinos.Slype.repositories.AgentRepository;
import com.unisinos.Slype.services.AbstractUserService;
import com.unisinos.Slype.services.AgentService;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class AgentServiceImpl extends AbstractUserService implements AgentService {
    @Resource
    AgentRepository agentRepository;

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
        return (List<AgentModel>) agentRepository.findAll();

    }

    @Override
    public AgentModel create(String email, String name) {
        if (Objects.isNull(agentRepository.findByEmail(email))) {
            return agentRepository.save(new AgentModel(email, name, "DefaultPassword2022"));
        }

        throw new DuplicateKeyException(String.format("Agent with email [%s] already exists!", email));
    }

    @Override
    public AgentModel updateAgentInformations(UserRequestDTO userRequest) {
        AgentModel agent = findById(userRequest.getId());
        agent.setName(userRequest.getName());
        agent.setEmail(userRequest.getEmail());
        agent.setUpdatedAt(LocalDateTime.now());

        return agentRepository.save(agent);
    }

    @Override
    public List<AgentModel> findAll() {
        return null;
    }

    @Override
    public AgentModel findById(long id) {
        Optional<AgentModel> agent = agentRepository.findById(id);

        if (agent.isPresent()) {
            return agent.get();
        }

        throw new ModelNotFoundException(String.format("Agent with ID [%s] not found!", id));
    }

    @Override
    public AgentModel save(AgentModel model) {
        return null;
    }

    @Override
    public void delete(AgentModel model) {

    }
}
