package by.step.repository;

import by.step.entity.User;
import by.step.entity.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    List<User> findByRole(UserRole role);

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    @Modifying
    @Transactional
    @Query("UPDATE User u SET u.balance = :balance WHERE u.id = :userId")
    void updateBalance(@Param("userId") Long userId,
                       @Param("balance") BigDecimal balance);

}
