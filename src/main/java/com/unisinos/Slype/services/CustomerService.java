package com.unisinos.Slype.services;

import com.unisinos.Slype.models.CustomerModel;
import com.unisinos.Slype.models.UserModel;

import java.util.List;

public interface CustomerService extends ModelService<UserModel> {
    CustomerModel findByEmail(String email);

    CustomerModel findByEmailOrNull(String email);

    List<CustomerModel> findAllCustomers();
}
