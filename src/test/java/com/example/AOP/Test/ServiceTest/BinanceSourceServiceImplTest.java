package com.example.AOP.Test.ServiceTest;


import com.example.AOP.Test.Service.BinanceSourceServiceImpl;
import com.example.AOP.Test.repository.CandlestickMyBatisRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
public class BinanceSourceServiceImplTest {



    @Autowired
    private BinanceSourceServiceImpl service;

    @Test
    public void getData_test(){
        service.getData("BTCUSDT",1523577600000L,1523664000000L);
    }


}
