package com.example.newspringbootapi.servicies;

import com.example.newspringbootapi.models.Address;
import com.example.newspringbootapi.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceAPI implements AddressService{

    @Autowired
    private AddressRepository addressDao;


    @Override
    public void saveAddress(Address address) {
        addressDao.save(address);
    }

    @Override
    public List<Address> getAllAddresses() {
        return addressDao.findAll();
    }

    @Override
    public void deleteAddress(Address id) {
        addressDao.delete(id);
    }

    @Override
    public Optional<Address> getOneAddress(long id) {
        return addressDao.findById(id);
    }
}
