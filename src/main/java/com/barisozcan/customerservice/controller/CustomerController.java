package com.barisozcan.customerservice.controller;

import com.barisozcan.customerservice.model.entity.CustomerEntity;
import com.barisozcan.customerservice.model.request.CustomerCreateRequest;
import com.barisozcan.customerservice.model.response.CustomerResponse;
import com.barisozcan.customerservice.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
@AllArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@Valid @RequestBody CustomerCreateRequest customerCreateRequest){
        customerService.create(customerCreateRequest);

    }

    @GetMapping("/{customerId}")
    public Optional<CustomerEntity> get(@PathVariable Long customerId){
        return customerService.get(customerId);
    }


}
