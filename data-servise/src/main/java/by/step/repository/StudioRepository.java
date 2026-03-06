package by.step.repository;

import by.step.entity.Profile;
import by.step.entity.Studio;
import by.step.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudioRepository extends JpaRepository<Studio,Long> {

    Optional<Studio> findByProfile(Profile profile);

    Optional<Studio> findByProfileUserId(Long userId);

    Optional<Studio> findByManager(User manager);
}
