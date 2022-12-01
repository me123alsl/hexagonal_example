package com.study.ex_hexagonal.application.port.inbound;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserInfo {
    private Long id;
    private String name;
}
