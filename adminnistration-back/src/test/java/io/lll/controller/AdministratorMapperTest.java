package io.lll.controller;

import io.lll.dao.AdministratorMapper;
import io.lll.po.Administrator;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author liulinli
 * @create 2020-03-16-19:11
 */
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AdministratorMapperTest {

    @Autowired
    private AdministratorMapper administratorMapper;

    @Test
    void selectByUsername(){
        String username="lll";
        Administrator administrator = administratorMapper.selectByUsername(username);
        assertNotNull(administrator);
        username="admin";
        administrator = administratorMapper.selectByUsername(username);
        assertNotNull(administrator);


    }

}
