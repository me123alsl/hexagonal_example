package com.study.ex_hexagonal.adapter.outbound;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.study.ex_hexagonal.domain.User;

@Repository
public interface UserPersistenceAdapter extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);

    Optional<User> findByName(String name);

}
