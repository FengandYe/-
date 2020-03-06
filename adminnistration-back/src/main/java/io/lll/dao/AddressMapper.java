package io.lll.dao;


import io.lll.dto.out.AddressListOutDTO;
import io.lll.po.Address;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressMapper {

    List<AddressListOutDTO> getListCustomerId(@Param("customerId") Integer customerId);

    int deleteByPrimaryKey(Integer addressId);

    int insert(Address record);

    int insertSelective(Address record);


    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    Address selectByPrimaryKey(Integer addressId);

    List<Address> selectByCustomerId(Integer customerId);
}