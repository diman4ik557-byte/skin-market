package by.step.repository;

import by.step.entity.Profile;
import by.step.entity.SocialLink;
import by.step.entity.enums.SocialPlatform;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SocialLinkRepository extends JpaRepository<SocialLink,Long> {

    List<SocialLink> findByProfile(Profile profile);

    Optional<SocialLink> findByProfileAndPlatform(Profile profile,
                                                  SocialPlatform platform);

    List<SocialLink> findByProfileAndPrimary(Profile profile);

    void deleteByProfile(Profile profile);
}
