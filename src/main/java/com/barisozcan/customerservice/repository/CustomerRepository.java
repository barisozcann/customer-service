package com.barisozcan.customerservice.repository;

import com.barisozcan.customerservice.model.entity.CustomerEntity;
import com.barisozcan.customerservice.model.response.CustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long>  {
    Optional<CustomerEntity> findById(final Long id);

}
