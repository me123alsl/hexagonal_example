package com.study.ex_hexagonal.application.port.outbound;

import com.study.ex_hexagonal.application.port.inbound.UserInfo;

public interface CreateUserUseCase {
    UserInfo create(String name);
}
