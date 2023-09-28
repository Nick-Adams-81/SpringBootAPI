package com.example.newspringbootapi.controllers;


import com.example.newspringbootapi.models.Address;
import com.example.newspringbootapi.servicies.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address")
    @ResponseBody
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @GetMapping("/one-address/{id}")
    @ResponseBody
    public Optional<Address> getOnePost(@PathVariable long id) {
        return addressService.getOneAddress(id);
    }

    @PostMapping("/save-address")
    @ResponseBody
    public String saveAddress(@RequestBody Address address) {
        addressService.saveAddress(address);
        return "Address saved";
    }

    @DeleteMapping("/delete-address/{id}")
    @ResponseBody
    public String deleteAddress(@PathVariable Address id) {
        addressService.deleteAddress(id);
        return "Address deleted";
    }


}
