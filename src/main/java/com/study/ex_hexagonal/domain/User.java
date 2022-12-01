package com.study.ex_hexagonal.domain;

import com.study.ex_hexagonal.application.port.inbound.UserInfo;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    public User() { }

    @Builder
    public User(String name) {
        this.name = name;
    }

    public UserInfo ConvertToUserInfo() {
        return UserInfo.builder().id(this.id).name(this.name).build();
    }
}
