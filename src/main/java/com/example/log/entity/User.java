package com.example.log.entity;

import lombok.Data;

@Data
public class User {
    private String name;
    private String ip;
    private String longitude;
    private String latitude;
    private String msg;
}
