package com.unisinos.Slype.services.impl;

import com.unisinos.Slype.dto.request.UserRequestDTO;
import com.unisinos.Slype.exceptions.ModelNotFoundException;
import com.unisinos.Slype.models.CustomerModel;
import com.unisinos.Slype.repositories.CustomerRepository;
import com.unisinos.Slype.services.AbstractUserService;
import com.unisinos.Slype.services.CustomerService;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CustomerServiceImpl extends AbstractUserService implements CustomerService {
    @Resource
    CustomerRepository customerRepository;

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
        return (List<CustomerModel>) customerRepository.findAll();
    }

    @Override
    public CustomerModel create(String email, String name) {
        if (Objects.isNull(customerRepository.findByEmail(email))) {
            return customerRepository.save(new CustomerModel(email, name, "DefaultPassword2022"));
        }

        throw new DuplicateKeyException(String.format("Customer with email [%s] already exists!", email));
    }

    @Override
    public CustomerModel updateCustomerInformations(UserRequestDTO userRequest) {
        CustomerModel customer = findById(userRequest.getId());
        customer.setName(userRequest.getName());
        customer.setEmail(userRequest.getEmail());
        customer.setUpdatedAt(LocalDateTime.now());

        return customerRepository.save(customer);
    }

    @Override
    public List<CustomerModel> findAll() {
        return null;
    }

    @Override
    public CustomerModel findById(long id) {
        Optional<CustomerModel> customer = customerRepository.findById(id);

        if (customer.isPresent()) {
            return customer.get();
        }

        throw new ModelNotFoundException(String.format("Customer with ID [%s] not found!", id));
    }

    @Override
    public CustomerModel save(CustomerModel model) {
        return null;
    }

    @Override
    public void delete(CustomerModel model) {

    }
}
