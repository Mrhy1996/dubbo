package com.mrhy.dubbo.service;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author mrhy
 * @date 2021/3/27 10:25
 * Copyright (C), 2018-2021
 */
@SPI
public interface Robot {
    void sayHello();
}
