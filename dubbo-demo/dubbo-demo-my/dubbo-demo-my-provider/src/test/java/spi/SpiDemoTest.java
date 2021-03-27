package spi;

import com.mrhy.dubbo.service.Robot;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.jupiter.api.Test;

import java.util.ServiceLoader;

/**
 * @author mrhy
 * @date 2021/3/27 10:30
 * Copyright (C), 2018-2021
 */
public class SpiDemoTest {
    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }
    @Test
    public void dubboSayHello() throws Exception {
        ExtensionLoader<Robot> extensionLoader =
                ExtensionLoader.getExtensionLoader(Robot.class);
        Robot optimusPrime = extensionLoader.getExtension("optimusPrime");
        optimusPrime.sayHello();
        Robot bumblebee = extensionLoader.getExtension("bumblebee");
        bumblebee.sayHello();
    }
}
