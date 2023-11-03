package com.seba.a.lot.repositories;

import com.seba.a.lot.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

@Table(name = "users")
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}