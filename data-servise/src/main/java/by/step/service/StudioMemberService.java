package by.step.service;

import by.step.dto.StudioMemberDto;

import java.util.List;
import java.util.Optional;

public interface StudioMemberService {

    StudioMemberDto addMember(Long studioId, Long artistId, String role);

    Optional<StudioMemberDto> findByStudioAndArtist(Long studioId, Long artistId);

    List<StudioMemberDto> findByStudio(Long studioId);

    List<StudioMemberDto> findByArtist(Long artistId);

    List<StudioMemberDto> findByStudioAndRole(Long studioId, String role);

    void updateRole(Long memberId, String role);

    void removeMember(Long studioId, Long artistId);

    boolean isMember(Long studioId, Long artistId);

    boolean isManager(Long studioId, Long artistId);

}
