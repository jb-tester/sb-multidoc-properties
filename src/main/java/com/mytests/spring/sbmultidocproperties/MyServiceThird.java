package com.mytests.spring.sbmultidocproperties;

/**
 * *
 * <p>Created by irina on 13.11.2020.</p>
 * <p>Project: sb-multidoc-properties</p>
 * *
 */
public class MyServiceThird implements MyService {
    @Override
    public String getHomeService() {
        return "third profile is active";
    }

    @Override
    public String getTest1Service() {
        return "third test passed";
    }
}
