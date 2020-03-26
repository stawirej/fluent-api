package com.github.stawirej.fluentapi.example.medicalcenter;

import java.time.Instant;

public final class Patient {

    private final Doctor doctor;
    private final Instant visitDate;
    private final Long id;
    private final Reason reason;

    public Patient(Long id) {

        this(id, null, null, null);
    }

    public Patient(
            Long id,
            Reason reason,
            Doctor doctor,
            Instant visitDate) {

        this.id = id;
        this.reason = reason;
        this.doctor = doctor;
        this.visitDate = visitDate;
    }

    public Instant visitDate() {

        return visitDate;
    }

    public Doctor doctor() {

        return doctor;
    }

    public Reason reason() {

        return reason;
    }

    public Long id() {

        return id;
    }
}
