package com.unisinos.Slype.repositories;

import com.unisinos.Slype.models.AgentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends CrudRepository<AgentModel, Long> {
    AgentModel findByEmail(String email);
}