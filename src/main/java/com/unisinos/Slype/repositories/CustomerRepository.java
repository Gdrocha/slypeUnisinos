package com.unisinos.Slype.repositories;

import com.unisinos.Slype.models.CustomerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerModel, Long> {
    CustomerModel findByEmail(String email);
}
