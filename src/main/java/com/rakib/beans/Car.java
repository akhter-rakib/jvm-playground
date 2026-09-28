package com.rakib.beans;

import lombok.Getter;

@Getter
public class Car {

    private final Integer id;
    private final String make;
    private final String model;
    private final String color;
    private final Integer year;
    private final Double price;

    public Car(
            Integer id,
            String make,
            String model,
            String color,
            Integer year,
            Double price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
