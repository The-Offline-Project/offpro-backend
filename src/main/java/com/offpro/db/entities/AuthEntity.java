package com.offpro.db.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "auth_entities")
public class AuthEntity implements java.io.Serializable {
  @Id
  private UUID id;

  @Column(name = "email", nullable = false)
  @Email
  @NotBlank
  private String email;

  @Column(name = "password", nullable = false)
  @NotBlank
  private String password;

  @Column(name = "username", nullable = false)
  @NotBlank
  private String username;
}
