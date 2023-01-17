package com.soxhwhat.springAOP;

import org.junit.Test;

/**
 * <p>商场打折逻辑测试</p>
 * <p>描述请遵循 javadoc 规范</p>
 *
 * @author Soxhwhat
 * @date 2023/1/17 20:09
 * @update [序号][日期YYYY-MM-DD] [更改人姓名][变更描述]
 */
public class DiscountMethodInterceptorTest {
    @Test
    public void test() {
        DiscountMethodInterceptor discountMethodInterceptor = new DiscountMethodInterceptor();
        discountMethodInterceptor.setDiscountRatio(80);
        discountMethodInterceptor.setCampaignAvailable(true);
//        discountMethodInterceptor.setTarget(new Market());
//        Market market = (Market) discountMethodInterceptor.getProxy();
//        market.sell();
    }
}
