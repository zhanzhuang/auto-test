package com.example.autotest.aspect2;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
    private String name;
    private int age;
    private String sex;
    private String createName;
    private String createCode;
    private Date createDate;

}
