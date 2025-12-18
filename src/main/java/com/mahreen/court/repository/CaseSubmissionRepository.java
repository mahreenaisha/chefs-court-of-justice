package com.mahreen.court.repository;

import com.mahreen.court.model.CaseStatus;
import com.mahreen.court.model.CaseSubmission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseSubmissionRepository
        extends JpaRepository<CaseSubmission, Long> {

    List<CaseSubmission> findBySubmittedBy(String submittedBy);

    List<CaseSubmission> findByStatus(CaseStatus status);

}
