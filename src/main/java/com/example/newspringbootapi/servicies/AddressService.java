package com.example.newspringbootapi.servicies;

import com.example.newspringbootapi.models.Address;

import java.util.List;

public interface AddressService {

    void saveAddress(Address address);

    List<Address> getAllAddresses();

    void deleteAddress(Address id);

    Address getOneAddress(long id);
}
