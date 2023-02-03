package com.jiuzhang.seckill.db.dao;

import com.jiuzhang.seckill.db.po.Order;

public interface OrderDao {

    public void insertOrder(Order order);

    public Order queryOrder(String orderNo);

    public void updateOrder(Order order);
}
