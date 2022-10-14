package com.example.jusantestbot.Repository;

import com.example.jusantestbot.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

}
