package io.lll.service;

import com.github.pagehelper.Page;
import io.lll.dto.in.ReturnSearchInDTO;
import io.lll.po.Return;

public interface ReturnService {
    Page<Return> search(ReturnSearchInDTO returnSearchInDTO, Integer pageNum);

    Return getById(Integer returnId);

    void update(Return aReturn);
}
