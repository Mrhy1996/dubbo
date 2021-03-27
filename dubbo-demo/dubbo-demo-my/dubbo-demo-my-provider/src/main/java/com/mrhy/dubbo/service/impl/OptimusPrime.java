package com.mrhy.dubbo.service.impl;

import com.mrhy.dubbo.service.Robot;

/**
 * @author mrhy
 * @date 2021/3/27 10:25
 * Copyright (C), 2018-2021
 */
public class OptimusPrime implements Robot {
    @Override
    public void sayHello() {
        System.out.println("Hello, I am Optimus Prime.");
    }
}
