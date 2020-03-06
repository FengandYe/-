package io.lll.controller;


import io.lll.dto.out.AddressListOutDTO;
import io.lll.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
@CrossOrigin
public class AddressController {

    @Autowired
    private AddressService addressService;


    @GetMapping("/getListCustomerId")
    public List<AddressListOutDTO> getListCustomerId(@RequestParam Integer customerId){
        List<AddressListOutDTO> listCustomerId = addressService.getListCustomerId(customerId);
        return listCustomerId;
    }

}
