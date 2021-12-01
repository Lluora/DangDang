package com.sparta.dangdang.repository;

import com.sparta.dangdang.domain.Feed;
import com.sparta.dangdang.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

}
