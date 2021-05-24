package com.mytests.spring.sbmultidocproperties;

/**
 * *
 * <p>Created by irina on 13.11.2020.</p>
 * <p>Project: sb-multidoc-properties</p>
 * *
 */
public class MyServiceSecond implements MyService {
    @Override
    public String getHomeService() {
        return "second profile is active";
    }

    @Override
    public String getTest1Service() {
        return "second test passed";
    }
}
