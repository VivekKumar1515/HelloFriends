package org.example.facebookapi.repository;

import org.example.facebookapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<User, String> {
}
