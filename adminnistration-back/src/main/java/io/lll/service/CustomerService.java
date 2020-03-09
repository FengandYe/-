package io.lll.service;

import com.github.pagehelper.Page;
import io.lll.dto.in.CustomerSearchInDTO;
import io.lll.dto.in.CustomerSetStatusInDTO;
import io.lll.po.Customer;

public interface CustomerService {
    Page<Customer> search(CustomerSearchInDTO customerSearchInDTO, Integer pageNum);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);

    Customer getById(Integer customerId);
}
