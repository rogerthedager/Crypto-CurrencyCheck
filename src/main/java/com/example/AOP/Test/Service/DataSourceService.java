package com.example.AOP.Test.Service;

import java.util.List;

public interface DataSourceService<T> {

    List<T> getData(String symbol, Long startTime, Long endTime);
}
