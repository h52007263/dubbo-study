package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;

import java.util.List;

/**
 *
 */

public interface UserService {

    /**
     * 按照用户id返回收货地址
     * @param userId
     * @return
     */
    public List<UserAddress> getUserAddressList(String userId);

}
