package com.unisinos.Slype.services.impl;

import com.unisinos.Slype.models.TicketModel;
import com.unisinos.Slype.services.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public List<TicketModel> findAll() {
        return null;
    }

    @Override
    public TicketModel findById(long id) {
        return null;
    }

    @Override
    public TicketModel save(TicketModel model) {
        return null;
    }

    @Override
    public void delete(TicketModel model) {

    }

    @Override
    public List<TicketModel> getAllTicketsByCustomerEmail(String customerEmail) {
        return null;
    }

    @Override
    public List<TicketModel> getAllTicketsByAgentEmail(String agentEmail) {
        return null;
    }
}
