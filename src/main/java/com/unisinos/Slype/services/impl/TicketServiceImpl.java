package com.unisinos.Slype.services.impl;

import com.unisinos.Slype.dto.request.TicketRegistrationRequestDTO;
import com.unisinos.Slype.dto.request.TicketRequestDTO;
import com.unisinos.Slype.exceptions.ModelNotFoundException;
import com.unisinos.Slype.models.AgentModel;
import com.unisinos.Slype.models.CustomerModel;
import com.unisinos.Slype.models.TicketModel;
import com.unisinos.Slype.repositories.TicketRepository;
import com.unisinos.Slype.services.AgentService;
import com.unisinos.Slype.services.CustomerService;
import com.unisinos.Slype.services.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {
    @Resource
    TicketRepository ticketRepository;

    @Resource
    AgentService agentService;

    @Resource
    CustomerService customerService;

    @Override
    public List<TicketModel> findAll() {
        return (List<TicketModel>) ticketRepository.findAll();
    }

    @Override
    public TicketModel findById(long id) {
        Optional<TicketModel> ticket = ticketRepository.findById(id);

        if (ticket.isPresent()) {
            return ticket.get();
        }

        throw new ModelNotFoundException(String.format("Ticket with ID [%s] not found!", id));
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

    @Override
    public TicketModel create(TicketRegistrationRequestDTO ticketRequest) {
        AgentModel agent = agentService.findById(ticketRequest.getAgentId());
        CustomerModel customer = customerService.findById(ticketRequest.getCustomerId());
        return ticketRepository.save(new TicketModel(agent, customer, ticketRequest.getDescription()));
    }

    @Override
    public TicketModel updateTicketInformations(TicketRequestDTO ticketRequest) {
        TicketModel ticket = findById(ticketRequest.getId());
        ticket.setAgent(agentService.findById(ticketRequest.getAgentId()));
        ticket.setCustomer(customerService.findById(ticketRequest.getCustomerId()));
        ticket.setDescription(ticketRequest.getDescription());
        ticket.setUpdatedAt(LocalDateTime.now());

        return ticketRepository.save(ticket);
    }
}
