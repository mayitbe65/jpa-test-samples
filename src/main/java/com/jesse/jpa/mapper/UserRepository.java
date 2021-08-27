package com.jesse.jpa.mapper;

import com.jesse.jpa.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yu.zhang
 * created on 2021-08-27
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
