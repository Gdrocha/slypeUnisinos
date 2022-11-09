package com.unisinos.Slype.services;

import com.unisinos.Slype.dto.request.UserRequestDTO;
import com.unisinos.Slype.models.CustomerModel;

import java.util.List;

public interface CustomerService extends ModelService<CustomerModel> {
    CustomerModel findByEmail(String email);

    CustomerModel findByEmailOrNull(String email);

    List<CustomerModel> findAllCustomers();

    CustomerModel create(String email, String name);

    CustomerModel updateCustomerInformations(UserRequestDTO userRequest);
}
