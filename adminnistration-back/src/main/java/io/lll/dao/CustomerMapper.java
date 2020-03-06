package io.lll.dao;

import com.github.pagehelper.Page;
import io.lll.dto.out.CustomerListOutDTO;
import io.lll.po.Customer;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerMapper {

    Page<CustomerListOutDTO> search();

    int deleteByPrimaryKey(Integer customerId);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer customerId);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    Integer disable(@Param("customerId") Integer customerId);
}