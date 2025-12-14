package com.mahreen.court.model;

import jakarta.persistence.*;

@Entity
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long caseId;

    private String jurorUsername;

    private boolean guilty;

    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public String getJurorUsername() {
        return jurorUsername;
    }

    public void setJurorUsername(String jurorUsername) {
        this.jurorUsername = jurorUsername;
    }

    public boolean isGuilty() {
        return guilty;
    }

    public void setGuilty(boolean guilty) {
        this.guilty = guilty;
    }
}