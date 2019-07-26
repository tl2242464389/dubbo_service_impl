package com.test.dubbo.service.impl;

import com.test.dubbo.service.TestService;

/**
 * @Description:
 * @Author: tl
 * @Date: 2019-06-25 11:00
 * @Version: 1.0
 */
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "test";
    }
}
