package com.study.ex_hexagonal.application.port.outbound;

import com.study.ex_hexagonal.application.port.inbound.UserInfo;
import com.study.ex_hexagonal.common.response.CommonResponse;

public interface SearchUserUseCase {
    CommonResponse<UserInfo> search(Long id);
    CommonResponse<UserInfo> search(String name);

}
