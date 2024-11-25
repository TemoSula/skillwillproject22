package com.example.skillwilllproject22.Repositories;

import com.example.skillwilllproject22.Models.*;
import feign.FeignException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "reqresin", url = "https://reqres.in/api")
public interface JsonPlaceholder {


    @GetMapping(path = "/users")
    PageModel getdataByPage(@RequestParam("page") int page, @RequestParam("per_page") int perPage);

    @GetMapping(path = "/users/{id}")
    Apiresponse getUserById(@PathVariable("id")int id);

    @PostMapping("/users")
    CreateUserModelResponse Create(@RequestBody CreateUserModelRequest createUserModelRequest);

    @DeleteMapping("/users/{id}")
    void delete(@PathVariable("id") int id);

    @PostMapping("/register")
    RegisterResponse registration(@RequestBody RegisterRequest registerRequest);

    @PutMapping("/users/{id}")
    UpdateUserModelResponse updateUserById(@PathVariable("id") int id,@RequestBody CreateUserModelRequest userModelRequest);



}
