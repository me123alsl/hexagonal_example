package com.study.ex_hexagonal.application.port.inbound;

import lombok.Data;

@Data
public class UserCreateCommand {
    private String name;
}
