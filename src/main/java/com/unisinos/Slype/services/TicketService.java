package com.unisinos.Slype.services;

import com.unisinos.Slype.dto.request.TicketRegistrationRequestDTO;
import com.unisinos.Slype.dto.request.TicketRequestDTO;
import com.unisinos.Slype.models.TicketModel;

import java.util.List;

public interface TicketService extends ModelService<TicketModel> {
    List<TicketModel> getAllTicketsByCustomerEmail(String customerEmail);

    List<TicketModel> getAllTicketsByAgentEmail(String agentEmail);

    TicketModel create(TicketRegistrationRequestDTO ticketRequest);

    TicketModel updateTicketInformations(TicketRequestDTO ticketRequest);
}
