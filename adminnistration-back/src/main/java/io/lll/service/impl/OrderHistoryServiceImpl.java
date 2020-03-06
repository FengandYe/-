package io.lll.service.impl;

import io.lll.dao.OrderHistoryMapper;
import io.lll.service.OrderHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderHistoryServiceImpl implements OrderHistoryService {
    @Autowired
    private OrderHistoryMapper orderHistoryMapper;
}
