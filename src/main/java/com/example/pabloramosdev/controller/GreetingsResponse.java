package com.example.pabloramosdev.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class GreetingsResponse {
    private String message;
}
