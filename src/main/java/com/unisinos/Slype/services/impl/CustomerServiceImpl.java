package com.unisinos.Slype.services.impl;

import com.unisinos.Slype.models.CustomerModel;
import com.unisinos.Slype.models.UserModel;
import com.unisinos.Slype.services.AbstractUserService;
import com.unisinos.Slype.services.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl extends AbstractUserService implements CustomerService {
    @Override
    public CustomerModel findByEmail(String email) {
        return null;
    }

    @Override
    public CustomerModel findByEmailOrNull(String email) {
        return null;
    }

    @Override
    public List<CustomerModel> findAllCustomers() {
        return null;
    }

    @Override
    public List<UserModel> findAll() {
        return null;
    }

    @Override
    public UserModel findById(long id) {
        return null;
    }

    @Override
    public UserModel save(UserModel model) {
        return null;
    }

    @Override
    public void delete(UserModel model) {

    }
}
