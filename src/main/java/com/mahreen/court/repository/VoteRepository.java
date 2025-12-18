package com.mahreen.court.repository;

import com.mahreen.court.model.Vote;
import com.mahreen.court.model.CaseSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    List<Vote> findByCaseSubmission(CaseSubmission caseSubmission);
}
