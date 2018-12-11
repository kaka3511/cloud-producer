package com.kaka.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/kaka")
public class KakaController {

    @GetMapping(value = "/get")
    public String get(@RequestParam(value = "one", required = false) String one,
                    @RequestParam(value = "two", required = false) String two){
        System.out.println(one + "--AND--" + two);
        return one + "--AND--" + two;
    }

    @PostMapping(value = "/post")
    public String post(@RequestBody Map map){
        System.out.println(JSON.toJSONString(map.values()));
        return JSON.toJSONString(map.values());
    }

}
