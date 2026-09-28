package com.rakib.interviewPractice;

import com.rakib.beans.Order;
import com.rakib.mockdata.MockData;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class GroupingOrder {

    @Test
    public void groupOrdersByVendor() {
        Map<String, Integer> expected = new HashMap<>();
        MockData.orders().forEach(order ->
                expected.merge(order.getVendor(), order.getQuantity(), Integer::sum));

        Map<String, Integer> result = MockData.orders().stream()
                .collect(Collectors.groupingBy(
                        Order::getVendor,
                        Collectors.summingInt(Order::getQuantity)
                ));
        /*
         * In SQL, this would be equivalent to:
         * SELECT vendor, SUM(quantity)
         * FROM orders
         * GROUP BY vendor;
         */
        assertEquals("Each vendor total should equal the sum of its order quantities", expected, result);
    }

}
