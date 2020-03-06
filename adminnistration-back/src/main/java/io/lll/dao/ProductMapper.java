package io.lll.dao;

import com.github.pagehelper.Page;
import io.lll.dto.out.ProductListOutDTO;
import io.lll.po.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {

    Page<ProductListOutDTO> search();

    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(@Param("productId") Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    void batchDelete(List<Integer> productIds);

}