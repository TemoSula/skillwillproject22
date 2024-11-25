package com.example.skillwilllproject22.Controllers;

import com.example.skillwilllproject22.Models.*;
import com.example.skillwilllproject22.Repositories.JsonPlaceholder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/skillwill")
public class JustController {


    private final JsonPlaceholder consumeApi;


    public JustController(JsonPlaceholder consumeApi) {
        this.consumeApi = consumeApi;
    }

    @GetMapping("/getbypageandperpage/{page}{per_page}")
    public PageModel getdataByPage(@RequestParam int page,@RequestParam int per_page)
    {
        return consumeApi.getdataByPage(page,per_page);
    }

    @GetMapping("/{id}")
    public Apiresponse getUserById(@RequestParam("id") int id)
    {
        return consumeApi.getUserById(id);
    }

    @PostMapping("/CreateUsers")
    public CreateUserModelResponse CreateUser(@RequestBody CreateUserModelRequest createUserModelRequest)
    {
        return consumeApi.Create(createUserModelRequest);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@RequestParam("id") int id)
    {
        consumeApi.delete(id);
    }

    @PostMapping("/registration")
    public RegisterResponse registration(@RequestBody RegisterRequest registerRequest)
    {
        return consumeApi.registration(registerRequest);
    }
    @PutMapping("/updateUser/{id}")
    public UpdateUserModelResponse updateUserById(@RequestParam int id, @RequestBody CreateUserModelRequest userModelRequest)
    {
        return consumeApi.updateUserById(id,userModelRequest);
    }




}
