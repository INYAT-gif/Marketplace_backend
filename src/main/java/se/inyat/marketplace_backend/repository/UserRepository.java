package se.inyat.marketplace_backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import se.inyat.marketplace_backend.model.entity.User;

import java.util.Optional;

/**
 * Repository for User entities.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     * Finds a user by email.
     *
     * @param email the email of the user
     * @return an optional containing the user if found, or empty if not found
     */
    Optional<User> findByEmail(String email);
}