package io.lll.controller;

import io.lll.dao.ReturnHistoryMapper;
import io.lll.dto.in.ReturnHistoryCreateInDTO;
import io.lll.dto.out.ReturnHistoryListOutDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/returnhistory")
@CrossOrigin
public class ReturnHistoryController {

    @Autowired
    private ReturnHistoryMapper returnHistoryMapper;

    @GetMapping("/getListReturnId")
    public List<ReturnHistoryListOutDTO> getListReturnId(@RequestParam Integer returnId){
        return null;
    }


    @PostMapping("/create")
    public Integer create(@RequestBody ReturnHistoryCreateInDTO returnHistoryCreateInDTO){
        return null;
    }
}
