package io.lll.controller;

import io.lll.dto.in.ReturnUpdateActionInDTO;
import io.lll.dto.out.PageOutDTO;
import io.lll.dto.out.ReturnListOutDTO;
import io.lll.dto.out.ReturnShowOutDTO;
import io.lll.service.ReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/return")
@CrossOrigin
public class ReturnController {

    @Autowired
    private ReturnService returnService;

    @GetMapping("/search")
    public PageOutDTO<ReturnListOutDTO> search(@RequestParam(required = false) Integer order_id,
                                               @RequestParam(required = false) String customer_name,
                                               @RequestParam(required = false) Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ReturnShowOutDTO getById(@RequestParam Integer returnId){
        return null;
    }

    @PostMapping("/updateAction")
    public void updateAction(@RequestBody ReturnUpdateActionInDTO returnUpdateActionInDTO){

    }
}
