package com.example.newspringbootapi.controllers;


import com.example.newspringbootapi.models.Address;
import com.example.newspringbootapi.servicies.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/address")
    @ResponseBody
    public List<Address> getAllAddresses() {
        return addressService.getAllAddresses();
    }

    @PostMapping("/save-address")
    @ResponseBody
    public String saveAddress(@RequestBody Address address) {
        addressService.saveAddress(address);
        return "Address saved";
    }

}
