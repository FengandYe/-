package io.lll.service;

import com.github.pagehelper.Page;
import io.lll.dto.in.ProductCreateInDTO;
import io.lll.dto.in.ProductUpdateInDTO;
import io.lll.dto.out.ProductListOutDTO;
import io.lll.dto.out.ProductShowOutDTO;

import java.util.List;

public interface ProductService {

    Page<ProductListOutDTO> search(Integer pageNum);

    ProductShowOutDTO getById(Integer productId);

    Integer create(ProductCreateInDTO productCreateInDTO);

    void update(ProductUpdateInDTO productUpdateInDTO);

    public void delete(Integer productId);

    public void batchDelete(List<Integer> productIds);
}
