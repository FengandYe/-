package io.lll.service;


import com.github.pagehelper.Page;
import io.lll.dto.out.ProductListOutDTO;
import io.lll.dto.out.ProductShowOutDTO;
import io.lll.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}
