package io.lll.service.impl;

import io.lll.dao.AddressMapper;
import io.lll.dto.out.AddressListOutDTO;
import io.lll.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressMapper addressMapper;

    @Override
    public List<AddressListOutDTO> getListCustomerId(Integer customerId) {
        List<AddressListOutDTO> listCustomerId = addressMapper.getListCustomerId(customerId);
        return listCustomerId;
    }


}
