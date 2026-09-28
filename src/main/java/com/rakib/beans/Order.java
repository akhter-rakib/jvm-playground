package com.rakib.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Order {
    private String id;
    private String vendor;
    private int quantity;
}
