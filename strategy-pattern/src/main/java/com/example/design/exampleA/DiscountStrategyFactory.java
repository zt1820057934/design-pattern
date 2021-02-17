package com.example.design.exampleA;

import java.util.HashMap;
import java.util.Map;

import com.example.design.ready.OrderType;

/**
 * DiscountStrategyFactory.
 * 策略工厂
 * @author zhangteng 2/16/21
 */
public class DiscountStrategyFactory {

    private static final Map<OrderType, DiscountStrategy> strategies = new HashMap<OrderType, DiscountStrategy>();

    static {
        strategies.put(OrderType.NORMAL, new NormalDiscountStrategy());
        // 省略 GroupON、Promotion
    }

    public static DiscountStrategy getDiscountStrategy(OrderType orderType) {
        return strategies.get(orderType);
    }

}
