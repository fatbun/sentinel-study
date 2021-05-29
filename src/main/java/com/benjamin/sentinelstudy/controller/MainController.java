package com.benjamin.sentinelstudy.controller;

import com.benjamin.sentinelstudy.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ben Li.
 * @since: 2021/5/29 下午5:50
 */
@RestController
public class MainController {

    @Autowired
    private MainService mainService;

    @GetMapping("/hi")
    public String hi(){
        return mainService.hi();
    }
}
