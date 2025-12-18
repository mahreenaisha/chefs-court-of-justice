# Chef’s Court of Justice – Backend API

## Overview

Chef’s Court of Justice is a backend system that simulates a judicial workflow where users can submit arguments and evidence, judges can review and manage cases, and jurors can vote on verdicts. The project is implemented using **Spring Boot**, **Spring Data JPA**, and **H2 database**, focusing on clean RESTful API design and core backend concepts.

This repository contains the backend implementation of the system.

---

## Tech Stack

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* H2 Database (in-memory / file-based)
* Maven

---

## Features Implemented

### Core Features

* Case submission by defendants and plaintiffs
* Storage of arguments and evidence as plaintext
* Judge actions:

  * View all cases
  * Edit case arguments and evidence
  * Approve or reject submissions
  * Delete cases
* View all case submissions

### Extended (Brownie Point) Features

* Mandatory judge approval workflow using case status (`PENDING`, `APPROVED`, `REJECTED`)
* Juror voting system:

  * Jurors can vote once per case
  * Votes recorded as `GUILTY` or `NOT_GUILTY`
  * Vote results aggregated per case
* Filtering cases by defendant/plaintiff name
* Role modeling using enums for clarity and extensibility

---

## User Roles

* **Defendant / Plaintiff**

  * Submit arguments and evidence
* **Judge**

  * Edit, approve, reject, and delete case submissions
  * View voting results
* **Juror**

  * View approved cases
  * Filter cases by name
  * Vote on verdicts

---

## API Endpoints

### Case Management

* `POST /case/submit` – Submit argument and evidence
* `GET /case/all` – View all case submissions
* `GET /case/approved` – View only approved cases
* `GET /case/by-name/{name}` – Filter cases by submitter name
* `PATCH /case/edit/{id}` – Edit a case (Judge)
* `PATCH /case/approve/{id}` – Approve a case (Judge)
* `PATCH /case/reject/{id}` – Reject a case (Judge)
* `DELETE /case/delete/{id}` – Delete a case (Judge)

### Jury Voting

* `POST /jury/vote/{caseId}` – Vote guilty or not guilty (Juror)
* `GET /jury/results/{caseId}` – View voting results (Judge/Juror)

---

## Database Design

* **CaseSubmission**

  * Stores arguments, evidence, submitter role, and case status
* **Vote**

  * Stores juror vote and verdict linked to a case
* **Enums**

  * `Role`, `CaseStatus`, `Verdict` stored as readable strings using `EnumType.STRING`

---

## Current Status

Authentication (signup/login and role-based route protection) is not yet implemented. The focus of this submission was on completing the **core business logic, workflow design, and data persistence layer**. Authentication can be integrated as the next step using Spring Security and JWT.

---

## How to Run

1. Clone the repository
2. Open in an IDE (IntelliJ / VS Code)
3. Run the Spring Boot application
4. Access APIs via Postman
5. Optional: Access H2 console if enabled in `application.properties`

---

## Future Enhancements

* Authentication and authorization using Spring Security and JWT

---
