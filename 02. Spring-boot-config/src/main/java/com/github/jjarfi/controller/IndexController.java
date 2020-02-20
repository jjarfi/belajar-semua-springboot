package com.github.jjarfi.controller;

import com.github.jjarfi.bean.ConfigBean;
import com.github.jjarfi.bean.SiteProperties;
import com.github.jjarfi.bean.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private SiteProperties siteProperties;

    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping("/")
    String index() {
        return testConfigBean.getName()+","+testConfigBean.getUmur();
    }
}
