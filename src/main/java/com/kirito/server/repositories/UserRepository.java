package com.kirito.server.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirito.server.models.UserDetail;

public interface UserRepository extends JpaRepository<UserDetail, Integer> {
  public UserDetail findByEmail(String email);
  public List<UserDetail> findByRole(String role);
  public UserDetail findByResetToken(String token);
  public Boolean existsByEmail(String email);
}
