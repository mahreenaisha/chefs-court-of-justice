package com.mahreen.court.repository;
import com.mahreen.court.model.CaseSubmission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CaseSubmissionRepository extends JpaRepository<CaseSubmission, Long> {

    List<CaseSubmission> findBySubmittedBy(String name);

    List<CaseSubmission> findByApprovedTrue();
}