package io.lll.service;

import com.github.pagehelper.Page;
import io.lll.po.Administrator;

import java.util.List;

public interface AdministratorService {

    Administrator getByUsername(String username);

    Administrator getById(Integer administratorId);

    void update(Administrator administrator);

    Page<Administrator> getList(Integer pageNum);

    Integer create(Administrator administrator);

    void delete(Integer adminstratorId);

    void batchDelete(List<Integer> administratorIds);

    Administrator getByEmail(String email);
}
