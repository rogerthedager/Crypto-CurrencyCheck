package com.example.AOP.Test.controller;

import com.example.AOP.Test.Service.CandlestickService;
import com.example.AOP.Test.model.Candlestick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class GetDataController {

    @Autowired
    private CandlestickService service;

    @GetMapping("/get")
    public List<Candlestick> get(@RequestParam String symbol, @RequestParam Long startTime, @RequestParam Long endTime, @RequestParam Integer interval){
        // TODO input validation
        return service.get(symbol, startTime, endTime, interval);
    }
}
/*use api to let the client get data through start time, end time, and symbol, interval
 create controller
 create get data function - start time, end time, symbol, interval
 create sql function to get the data from the sql

 change the interval to the required interval
 show the data to the client
 */