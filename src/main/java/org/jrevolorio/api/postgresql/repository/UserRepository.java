package org.jrevolorio.api.postgresql.repository;

import org.jrevolorio.api.postgresql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
