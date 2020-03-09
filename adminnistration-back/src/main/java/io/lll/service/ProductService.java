package io.lll.service;


import com.github.pagehelper.Page;
import io.lll.dto.in.ProductCreateInDTO;
import io.lll.dto.in.ProductSearchInDTO;
import io.lll.dto.in.ProductUpdateInDTO;
import io.lll.dto.out.ProductListOutDTO;
import io.lll.dto.out.ProductShowOutDTO;

public interface ProductService {

    Integer create(ProductCreateInDTO productCreateInDTO);

    Page<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO, Integer pageNum);

    void update(ProductUpdateInDTO productUpdateInDTO);

    ProductShowOutDTO getById(Integer productId);
}
