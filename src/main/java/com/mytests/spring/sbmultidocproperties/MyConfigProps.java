package com.mytests.spring.sbmultidocproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;


@ConfigurationProperties("my.props")
//@Component
public class MyConfigProps {
    String prop1;
    String prop2;
    String prop3;
    List<String> prop4;
    List<String> prop5;

    public List<String> getProp4() {
        return prop4;
    }

    public void setProp4(List<String> prop4) {
        this.prop4 = prop4;
    }

    public List<String> getProp5() {
        return prop5;
    }

    public void setProp5(List<String> prop5) {
        this.prop5 = prop5;
    }

    public String getProp3() {
        return prop3;
    }

    public void setProp3(String prop3) {
        this.prop3 = prop3;
    }

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public String getProp2() {
        return prop2;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

}
