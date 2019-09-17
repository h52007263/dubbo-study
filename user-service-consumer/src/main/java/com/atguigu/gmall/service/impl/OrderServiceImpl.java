package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.OrderService;
import com.atguigu.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hezhensheng
 * @version 1.0
 * @description OrderServiceImpl
 * @date 2019/9/17 15:46
 */

/**
 * 1.服务提供者注册服务到注册中心
 *      1）导入dubbo依赖2.6.2
 *      2）配置服务提供商
 *
 * 2.服务消费者去注册中心订阅服务提供者的服务地址
 */

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    UserService userService;
    @Override
    public List<UserAddress> initOrder(final String userId) {
        System.out.println(userService);
        System.out.println("用户id：" + userId);
        // 1.查询用户的收货地址
        List<UserAddress> addressesList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressesList) {
            System.out.println(userAddress);
        }
        return addressesList;
    }
}
