package com.barisozcan.customerservice.service;

import com.barisozcan.customerservice.model.entity.CustomerEntity;
import com.barisozcan.customerservice.model.request.CustomerCreateRequest;
import com.barisozcan.customerservice.model.response.CustomerResponse;

import java.util.Optional;

public interface CustomerService {
    void create(CustomerCreateRequest customerCreateRequest);


    Optional<CustomerEntity> get(Long customerId);
}
