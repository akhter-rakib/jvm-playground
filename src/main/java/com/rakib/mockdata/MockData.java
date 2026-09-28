package com.rakib.mockdata;

import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.rakib.beans.Car;
import com.rakib.beans.Order;
import com.rakib.beans.Person;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MockData {
    private MockData() {
        /* This utility class should not be instantiated */
    }

    public static List<Person> getPeople() throws IOException {
        InputStream inputStream = Resources.getResource("people.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Person>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    public static List<Car> getCar() throws IOException {
        InputStream inputStream = Resources.getResource("cars.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        Type listType = new TypeToken<ArrayList<Car>>() {
        }.getType();
        return new Gson().fromJson(json, listType);
    }

    public static Map<String, Double> employee() {
        return Map.ofEntries(
                Map.entry("anil", 1000.00),
                Map.entry("bhavna", 130.00),
                Map.entry("micael", 1500.00),
                Map.entry("tom", 1600.00),
                Map.entry("ankit", 1200.00),
                Map.entry("ankur", 1200.00),
                Map.entry("daniel", 1700.00),
                Map.entry("daniel angel", 1700.00),
                Map.entry("james", 1400.00),
                Map.entry("rakib", 45400.00)
        );
    }

    public static List<Employee> employeeList() {
        return List.of(
                new Employee("Rakib", 1000),
                new Employee("Sakib", 1200),
                new Employee("Akib", 1400)
        );
    }

    public static List<CityEmployee> cityEmployees() {
        return List.of(
                new CityEmployee("John Doe", 75000, "New York", 14),
                new CityEmployee("Jane Smith", 30000, "Los Angeles", 45),
                new CityEmployee("Michael Brown", 7000, "Chicago", 20),
                new CityEmployee("Alice Johnson", 92000, "San Francisco", 15),
                new CityEmployee("David Miller", 55000, "Houston", 18)
        );
    }

    public static List<Order> orders() {
        return List.of(
                new Order("1", "Vendor A", 10),
                new Order("2", "Vendor B", 5),
                new Order("3", "Vendor A", 8),
                new Order("4", "Vendor C", 12),
                new Order("5", "Vendor B", 7)
        );
    }
}
