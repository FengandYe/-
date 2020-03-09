package io.lll.service;

import com.github.pagehelper.Page;
import io.lll.dto.in.OrderCheckoutInDTO;
import io.lll.dto.out.OrderShowOutDTO;
import io.lll.po.Order;

public interface OrderService {

    Long checkout(OrderCheckoutInDTO orderCheckoutInDTO,
                  Integer customerId);

    Page<Order> getByCustomerId(Integer pageNum, Integer customerId);

    OrderShowOutDTO getById(Long orderId);

}
