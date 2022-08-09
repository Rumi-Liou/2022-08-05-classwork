package com.example.springwebservice.model;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// 使用 Lombok 加入 Getter, Setter, Constructor
@Getter
@Setter
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
}
