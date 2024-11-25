package com.example.skillwilllproject22.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UpdateUserModelResponse {

    private String name;
    private String job;
    private Date updatedAt;
}
