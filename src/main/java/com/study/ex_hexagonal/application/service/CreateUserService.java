package com.study.ex_hexagonal.application.service;

import com.study.ex_hexagonal.common.exception.CustomException;
import com.study.ex_hexagonal.common.response.CommonResponse;
import org.springframework.stereotype.Service;

import com.study.ex_hexagonal.adapter.outbound.UserPersistenceAdapter;
import com.study.ex_hexagonal.application.port.inbound.UserInfo;
import com.study.ex_hexagonal.application.port.outbound.CreateUserUseCase;
import com.study.ex_hexagonal.application.port.outbound.SearchUserUseCase;
import com.study.ex_hexagonal.domain.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CreateUserService implements CreateUserUseCase, SearchUserUseCase {
    private final UserPersistenceAdapter userRepository;

    @Override
    public CommonResponse<UserInfo> search(Long id) {
        User user = (User) userRepository.findById(id)
                .orElseThrow( () -> new CustomException("E001", "not found record") );
        return CommonResponse.<UserInfo>builder()
                .success(true)
                .response(user.ConvertToUserInfo())
                .build();
    }

    @Override
    public CommonResponse<UserInfo> search(String name) {
        User user = userRepository.findByName(name)
                .orElseThrow( () -> new CustomException("E001", "not found record") );
        return CommonResponse.<UserInfo>builder()
                .success(true)
                .response(user.ConvertToUserInfo())
                .build();
    }

    @Override
    public UserInfo create(String name) {
        User user = User.builder().name(name).build();
        return userRepository.save(user).ConvertToUserInfo();
    }

}