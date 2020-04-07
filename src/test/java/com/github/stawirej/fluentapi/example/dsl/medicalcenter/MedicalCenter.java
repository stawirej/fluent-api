package com.github.stawirej.fluentapi.example.dsl.medicalcenter;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public final class MedicalCenter {

    private final Map<Id, Patient> patients = new HashMap<>();

    //    public With register(Patient patient) {
    //
    //        return new With() {
    //            @Override
    //            public To with(Reason reason) {
    //
    //                return new To() {
    //                    @Override
    //                    public At to(Doctor doctor) {
    //
    //                        return new At() {
    //                            @Override
    //                            public void at(Instant date) {
    //
    //                                register(patient, reason, doctor, date);
    //                            }
    //                        };
    //                    }
    //                };
    //            }
    //        };
    //    }

    public With register(Patient patient) {

        return reason -> doctor -> date -> register(patient, reason, doctor, date);
    }

    public Patient getPatientBy(Id id) {

        return patients.get(id);
    }

    private void register(
            Patient patient,
            Reason reason,
            Doctor doctor,
            Instant date) {

        if (!patients.containsKey(patient.id())) {
            patients.put(patient.id(), patient);
        }

        patients.replace(patient.id(), new Patient(patient.id(), reason, doctor, date));
    }
}
