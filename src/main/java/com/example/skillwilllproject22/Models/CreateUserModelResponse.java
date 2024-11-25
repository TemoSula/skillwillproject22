package com.example.skillwilllproject22.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

import java.util.Date;

@Getter
@Setter
public class CreateUserModelResponse {

    private String name;
    private String job;
    private String id;
    private Date createdAt;
}
