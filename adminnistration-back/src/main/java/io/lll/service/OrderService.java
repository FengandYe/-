package io.lll.service;

import com.github.pagehelper.Page;
import io.lll.dto.out.OrderListOutDTO;
import io.lll.dto.out.OrderShowOutDTO;

public interface OrderService {

    Page<OrderListOutDTO> search(Integer pageNum);

    OrderShowOutDTO getById(Long orderId);



}
