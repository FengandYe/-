package io.lll.controller;

import io.lll.dto.in.OrderSearchInDTO;
import io.lll.dto.out.*;
import io.lll.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/search")
    public PageOutDTO<OrderListOutDTO> search(OrderSearchInDTO orderSearchInDTO,
                                              @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public OrderShowOutDTO getById(@RequestParam Integer orderId){
        return null;

    }

    @GetMapping("/getInvoice")
    public OrderInvoiceShowOutDTO getInvoice(@RequestParam Long orderId){
        return null;
    }

    @GetMapping("/getShipInfo")
    public OrderShipShowOutDTO getShipInfo(@RequestBody Long orderId){
        return null;
    }

}
