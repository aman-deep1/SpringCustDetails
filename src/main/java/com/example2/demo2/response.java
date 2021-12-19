package com.example2.demo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Data

public class response {
   
    String msg;
    Object data;
   
}