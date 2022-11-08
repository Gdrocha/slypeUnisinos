package com.unisinos.Slype.repositories;

import com.unisinos.Slype.models.TicketModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketRepository extends CrudRepository<TicketModel, Long> {
    List<TicketModel> getAllByCustomer_Email(String customerEmail);

    List<TicketModel> getAllByAgent_Email(String agentEmail);
}