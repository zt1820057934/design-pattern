package com.example.design.ready;

/**
 * OrderType.
 *
 * @author zhangteng 2/16/21
 */
public enum OrderType {

    NORMAL(1, "普通订单"),
    GROUPON(2, "团购订单"),
    PROMOTION(3, "促销订单");

    Integer value;

    String desc;

    OrderType(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }


}
