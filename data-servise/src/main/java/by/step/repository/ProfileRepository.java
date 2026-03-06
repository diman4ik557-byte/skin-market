package by.step.repository;

import by.step.entity.Profile;
import by.step.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile,Long> {

    Optional<Profile> findByUser(User user);

    Optional<Profile> findByUserId(Long userId);
}
