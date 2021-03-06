package io.lll.controller;


import com.github.pagehelper.Page;
import io.lll.dto.in.ProductCreateInDTO;
import io.lll.dto.in.ProductSearchInDTO;
import io.lll.dto.in.ProductUpdateInDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.dto.out.ProductListOutDTO;
import io.lll.dto.out.ProductShowOutDTO;
import io.lll.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(
            ProductSearchInDTO productSearchInDTO,
            @RequestParam(required = false, defaultValue = "1") Integer pageNum
    ){
        Page<ProductListOutDTO> page = productService.search(productSearchInDTO,pageNum);
        PageOutDTO<ProductListOutDTO> pageOutDTO = new PageOutDTO<>();
        pageOutDTO.setTotal(page.getTotal());
        pageOutDTO.setPageSize(page.getPageSize());
        pageOutDTO.setPageNum(page.getPageNum());
        pageOutDTO.setList(page);

        return pageOutDTO;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(
            @RequestParam Integer productId
    ){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }

    @PostMapping("/create")
    public Integer create(
            @RequestBody ProductCreateInDTO productCreateInDTO
    ){
        Integer productId = productService.create(productCreateInDTO);
        return productId;
    }

    @PostMapping("/update")
    public void update(
            @RequestBody ProductUpdateInDTO productUpdateInDTO
    ){
        productService.update(productUpdateInDTO);
    }
}
