package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.lastName LIKE :name")
    Iterable<Customer> findByName(@Param("name") String name);


}
