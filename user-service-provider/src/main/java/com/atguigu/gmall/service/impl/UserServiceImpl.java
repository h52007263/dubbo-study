package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author hezhensheng
 * @version 1.0
 * @description UserServiceImpl
 * @date 2019/9/17 11:00
 */

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "北京市昌平区1层", "1", "李老师", "010-5625", "");
        UserAddress address2 = new UserAddress(2, "深圳市宝安区2层", "1", "李老师", "010-5625", "");
        return Arrays.asList(address1, address2);
    }
}
