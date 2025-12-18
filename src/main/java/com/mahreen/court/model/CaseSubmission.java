package com.mahreen.court.model;

import jakarta.persistence.*;

@Entity
public class CaseSubmission {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String submittedBy;

    private String argumentText;

    private String evidenceText;

    @Enumerated(EnumType.STRING)
    private Role submittedRole;

    private boolean approved;

    // 🔹 Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getArgumentText() {
        return argumentText;
    }

    public void setArgumentText(String argumentText) {
        this.argumentText = argumentText;
    }

    public String getEvidenceText() {
        return evidenceText;
    }

    public void setEvidenceText(String evidenceText) {
        this.evidenceText = evidenceText;
    }

    public Role getSubmittedRole() {
        return submittedRole;
    }

    public void setSubmittedRole(Role submittedRole) {
        this.submittedRole = submittedRole;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
