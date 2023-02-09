package com.tawhid.crudusingspringbootreactjs.repository;

import com.tawhid.crudusingspringbootreactjs.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
