package com.example.newspringbootapi.servicies;

import com.example.newspringbootapi.models.Address;

import java.util.List;
import java.util.Optional;

public interface AddressService {

    void saveAddress(Address address);

    List<Address> getAllAddresses();

    void deleteAddress(Address id);

    Optional<Address> getOneAddress(long id);
}
