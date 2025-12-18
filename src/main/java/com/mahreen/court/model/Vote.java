package com.mahreen.court.model;

import jakarta.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private CaseSubmission caseSubmission;

    @Enumerated(EnumType.STRING)
    private Verdict verdict; // GUILTY / NOT_GUILTY

    private String jurorName;

    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public CaseSubmission getCaseSubmission() { return caseSubmission; }
    public void setCaseSubmission(CaseSubmission caseSubmission) { this.caseSubmission = caseSubmission; }

    public Verdict getVerdict() { return verdict; }
    public void setVerdict(Verdict verdict) { this.verdict = verdict; }

    public String getJurorName() { return jurorName; }
    public void setJurorName(String jurorName) { this.jurorName = jurorName; }
}
