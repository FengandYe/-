package io.lll.service;

import com.github.pagehelper.Page;
import io.lll.dto.in.CustomerSetStatusInDTO;
import io.lll.po.Customer;

public interface CustomerService {

    Page<Customer> search(Integer pageNum);

    Customer getById(Integer customerId);

    void setStatus(CustomerSetStatusInDTO customerSetStatusInDTO);
}
