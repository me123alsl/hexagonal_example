package com.study.ex_hexagonal.adapter.inbound;

import com.study.ex_hexagonal.common.response.CommonResponse;
import org.springframework.web.bind.annotation.*;

import com.study.ex_hexagonal.application.port.inbound.UserCreateCommand;
import com.study.ex_hexagonal.application.port.inbound.UserInfo;
import com.study.ex_hexagonal.application.port.outbound.CreateUserUseCase;
import com.study.ex_hexagonal.application.port.outbound.SearchUserUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class UserAdapter {

    final private CreateUserUseCase userCreateUseCase;
    final private SearchUserUseCase searchUserUseCase;

    @PostMapping("/user")
    public UserInfo createUser(@RequestBody UserCreateCommand userCreateRequest) {
        return userCreateUseCase.create(userCreateRequest.getName());
    }

    @GetMapping("/user/{id}")
    public CommonResponse<UserInfo> getUser(@PathVariable Long id) {
        return searchUserUseCase.search(id);
    }

}
