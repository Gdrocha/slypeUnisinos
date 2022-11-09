package com.unisinos.Slype.controllers;

import com.unisinos.Slype.dto.request.TicketRegistrationRequestDTO;
import com.unisinos.Slype.dto.request.TicketRequestDTO;
import com.unisinos.Slype.models.TicketModel;
import com.unisinos.Slype.services.TicketService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Resource
    TicketService ticketService;

    @ApiOperation(value = "Create an ticket.")
    @GetMapping("/create")
    public TicketModel createTicket(TicketRegistrationRequestDTO ticketRequest) {
        return ticketService.create(ticketRequest);
    }

    @ApiOperation(value = "Get all tickets.")
    @GetMapping("/all")
    public List<TicketModel> getAllTickets() {
        return ticketService.findAll();
    }

    @ApiOperation(value = "Update an ticket.")
    @GetMapping("/update")
    public TicketModel updateTicketInformations(TicketRequestDTO ticketRequest) {
        return ticketService.updateTicketInformations(ticketRequest);
    }

    @ApiOperation(value = "Get a ticket by ID.")
    @GetMapping("/get")
    public TicketModel getTicket(@RequestParam Long id) {
        return ticketService.findById(id);
    }
}
