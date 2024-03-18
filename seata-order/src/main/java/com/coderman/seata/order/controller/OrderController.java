package com.coderman.seata.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhangyukang
 * @date ：2024/03/18 18:22
 */
@RestController
public class OrderController {

    @GetMapping(value = "/api")
    public ResponseEntity<String> orderApi(){
        return ResponseEntity.ok("订单服务");
    }
}
