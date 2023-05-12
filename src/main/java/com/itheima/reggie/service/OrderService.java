package com.itheima.reggie.service;

/*
 * @author 胡国兴
 * @version 1.0
 */

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.entity.Orders;
import com.itheima.reggie.mapper.OrderMapper;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
}
