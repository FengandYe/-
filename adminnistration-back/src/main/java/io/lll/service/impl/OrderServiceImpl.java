package io.lll.service.impl;

import io.lll.dao.OrderDetailMapper;
import io.lll.dao.OrderMapper;
import io.lll.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private OrderDetailMapper orderDetailMapper;
}
