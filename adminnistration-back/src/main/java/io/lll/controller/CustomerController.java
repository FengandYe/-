package io.lll.controller;

import com.github.pagehelper.Page;
import io.lll.dto.in.CustomerSearchInDTO;
import io.lll.dto.out.CustomerListOutDTO;
import io.lll.dto.out.CustomerShowOutDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/search")
    public PageOutDTO<CustomerListOutDTO> search(CustomerSearchInDTO customerSearchInDTO,
                                                 @RequestParam(required = false,defaultValue = "1") Integer pageNum){
        Page<CustomerListOutDTO> page = customerService.search(pageNum);
        PageOutDTO<CustomerListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);
        return pageOutDTO;
    }

    @GetMapping("/getById")
    public CustomerShowOutDTO getById(@RequestParam Integer customerId){
        CustomerShowOutDTO customerById = customerService.getById(customerId);
        return customerById;
    }

    @PostMapping("/disable")
    public Integer disable(@RequestParam Integer customerId){
        Integer disable = customerService.disable(customerId);
        return disable;
    }


}
