package by.step.repository;

import by.step.entity.ArtistProfile;
import by.step.entity.Studio;
import by.step.entity.StudioMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudioMemberRepository extends JpaRepository<StudioMember,Long> {

    List<StudioMember> findByStudio(Studio studio);

    List<StudioMember> findByMember(ArtistProfile member);

    Optional<StudioMember> findByStudioAndMember(Studio studio, ArtistProfile member);

    List<StudioMember> findByStudioAndRole(Studio studio, String role);

    boolean existsByStudioAndMember(Studio studio, ArtistProfile member);
}
