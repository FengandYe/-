package io.lll.controller;

import io.lll.dto.in.OrderHistoryCreateInDTO;
import io.lll.dto.out.OrderHistoryListOutDTO;
import io.lll.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderhistory")
@CrossOrigin
public class OrderHistoryController {

    @Autowired
    private OrderHistoryService orderHistoryService;

    @GetMapping("/getListByOrderId")
    public List<OrderHistoryListOutDTO> getListByOrderId(@RequestParam Long orderId){
        return  null;
    }

    @PostMapping("/create")
    public Integer create(@RequestBody OrderHistoryCreateInDTO orderHistoryCreateInDTO){

        return null;
    }
}
