package com.coderman.seata.warehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：zhangyukang
 * @date ：2024/03/18 18:24
 */
@RestController
public class WarehouseController {

    @GetMapping(value = "/api")
    public ResponseEntity<String> orderApi(){
        return ResponseEntity.ok("仓库服务");
    }
}
