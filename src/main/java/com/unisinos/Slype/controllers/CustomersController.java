package com.unisinos.Slype.controllers;

import com.unisinos.Slype.dto.request.UserRegistrationRequestDTO;
import com.unisinos.Slype.dto.request.UserRequestDTO;
import com.unisinos.Slype.models.CustomerModel;
import com.unisinos.Slype.services.CustomerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController {
    @Resource
    CustomerService customerService;

    @ApiOperation(value = "Create a customer.")
    @GetMapping("/create")
    public CustomerModel createCustomer(UserRegistrationRequestDTO userRequest) {
        return customerService.create(userRequest.getEmail(), userRequest.getEmail());
    }

    @ApiOperation(value = "Get all customers.")
    @GetMapping("/all")
    public List<CustomerModel> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @ApiOperation(value = "Update a customer.")
    @GetMapping("/update")
    public CustomerModel updateCustomerInformations(UserRequestDTO userRequest) {
        return customerService.updateCustomerInformations(userRequest);
    }

    @ApiOperation(value = "Get a customer by ID.")
    @GetMapping("/get")
    public CustomerModel getCustomer(@RequestParam Long id) {
        return (CustomerModel) customerService.findById(id);
    }
}