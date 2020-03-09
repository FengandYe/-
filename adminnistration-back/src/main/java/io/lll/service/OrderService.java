package io.lll.service;

import com.github.pagehelper.Page;
import io.lll.dto.out.OrderListOutDTO;
import io.lll.dto.out.OrderShowOutDTO;
import io.lll.po.Order;

public interface OrderService {
    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);

    void update(Order order);
}
