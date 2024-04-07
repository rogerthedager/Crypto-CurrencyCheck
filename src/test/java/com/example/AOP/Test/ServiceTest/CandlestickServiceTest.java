package com.example.AOP.Test.ServiceTest;

import com.example.AOP.Test.Service.CandlestickService;
import com.example.AOP.Test.Service.DataSourceService;
import com.example.AOP.Test.Service.Refactor;
import com.example.AOP.Test.model.Candlestick;
import com.example.AOP.Test.repository.CandlestickMyBatisRepository;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.List;


@ExtendWith(MockitoExtension.class)
public class CandlestickServiceTest {


    @Mock
    private CandlestickMyBatisRepository candleRepository;

    @Mock
    private Refactor refactor;

    @Autowired
    private DataSourceService<Candlestick> dataSourceService;
    @InjectMocks
    private CandlestickService service;

    @Test
    public void test_load(){
        service.load("BTCUSDT",1523577600000L,1523664000000L);
    }

    @Test
    public void test_get(){
        List<Candlestick> testC =  service.get("BTCUSDT",1523577600000L,1523664000000L,4);
        Mockito.verify(refactor).intervalRefactor(testC,4);
    }
}
//40be833c10a5401597780eb154ab2561