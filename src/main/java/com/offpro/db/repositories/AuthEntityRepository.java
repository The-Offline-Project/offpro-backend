package com.offpro.db.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.offpro.db.entities.AuthEntity;

@Repository
public interface AuthEntityRepository extends JpaRepository<AuthEntity, UUID> {
  AuthEntity findByEmail(String email);
  AuthEntity findByUsername(String username);
}
                                