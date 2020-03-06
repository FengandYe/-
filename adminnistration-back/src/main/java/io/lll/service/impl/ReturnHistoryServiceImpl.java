package io.lll.service.impl;

import io.lll.dao.ReturnHistoryMapper;
import io.lll.service.ReturnHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReturnHistoryServiceImpl implements ReturnHistoryService {
    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;
}
