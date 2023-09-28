package com.example.newspringbootapi.repositories;

import com.example.newspringbootapi.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
