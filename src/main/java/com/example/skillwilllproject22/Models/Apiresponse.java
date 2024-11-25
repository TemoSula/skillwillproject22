package com.example.skillwilllproject22.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Apiresponse {
private Support support;
@JsonProperty("data")
private Data userModel;

}
