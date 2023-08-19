package com.barisozcan.customerservice.serviceimpl;

import com.barisozcan.customerservice.model.entity.CustomerEntity;
import com.barisozcan.customerservice.model.request.CustomerCreateRequest;
import com.barisozcan.customerservice.model.response.CustomerResponse;
import com.barisozcan.customerservice.repository.CustomerRepository;
import com.barisozcan.customerservice.service.CustomerService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public void create(CustomerCreateRequest customerCreateRequest) {

        final CustomerEntity customerEntity = modelMapper.map(customerCreateRequest, CustomerEntity.class);

        customerRepository.save(customerEntity);

    }

    public Optional<CustomerEntity> get(Long customerId){
        return customerRepository.findById(customerId);
    }

}
