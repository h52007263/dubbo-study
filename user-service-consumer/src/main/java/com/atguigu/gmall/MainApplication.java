package com.atguigu.gmall;

import com.atguigu.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author hezhensheng
 * @version 1.0
 * @description MainApplication
 * @date 2019/9/17 16:55
 */

public class MainApplication {
    public static void main(String[] args) throws IOException {
        System.out.println("开始调用");
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("调用结束");
        System.in.read();
    }
}
