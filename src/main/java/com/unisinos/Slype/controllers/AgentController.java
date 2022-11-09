package com.unisinos.Slype.controllers;

import com.unisinos.Slype.dto.request.UserRegistrationRequestDTO;
import com.unisinos.Slype.dto.request.UserRequestDTO;
import com.unisinos.Slype.models.AgentModel;
import com.unisinos.Slype.services.AgentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/agents")
public class AgentController {
    @Resource
    AgentService agentService;

    @ApiOperation(value = "Create an agent.")
    @GetMapping("/create")
    public AgentModel createAgent(UserRegistrationRequestDTO userRequest) {
        return agentService.create(userRequest.getEmail(), userRequest.getEmail());
    }

    @ApiOperation(value = "Get all agents.")
    @GetMapping("/all")
    public List<AgentModel> getAllAgents() {
        return agentService.findAllAgents();
    }

    @ApiOperation(value = "Update an agent.")
    @GetMapping("/update")
    public AgentModel updateAgentInformations(UserRequestDTO userRequest) {
        return agentService.updateAgentInformations(userRequest);
    }

    @ApiOperation(value = "Get a agent by ID.")
    @GetMapping("/get")
    public AgentModel getAgent(@RequestParam Long id) {
        return agentService.findById(id);
    }
}