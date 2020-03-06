package io.lll.service;

import com.github.pagehelper.Page;
import io.lll.dto.out.CustomerListOutDTO;
import io.lll.dto.out.CustomerShowOutDTO;

public interface CustomerService {

    Page<CustomerListOutDTO> search(Integer pageNum);

    CustomerShowOutDTO getById(Integer customerId);

    Integer disable(Integer customerId);
}
