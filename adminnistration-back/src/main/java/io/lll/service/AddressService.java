package io.lll.service;


import io.lll.dto.out.AddressListOutDTO;

import java.util.List;

public interface AddressService {

    List<AddressListOutDTO> getListCustomerId(Integer customerId);

}
