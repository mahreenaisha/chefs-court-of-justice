package com.mahreen.court.repository;

import com.mahreen.court.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    boolean existsByCaseIdAndJurorUsername(Long caseId, String jurorUsername);

    long countByCaseIdAndGuilty(Long caseId, boolean guilty);
}
