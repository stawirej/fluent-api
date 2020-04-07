package com.github.stawirej.fluentapi.example.dslgeneric.medicalcenter;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public final class MedicalCenter {

    private final Map<Id, Patient> patients = new HashMap<>();

//    public With<Reason, Doctor, Instant> register(Patient patient) {
    //
    //        return new With<Reason, Doctor, Instant>() {
    //            @Override
    //            public To<Doctor, Instant> with(Reason reason) {
    //
    //                return new To<Doctor, Instant>() {
    //                    @Override
    //                    public At<Instant> to(Doctor doctor) {
    //
    //                        return new At<Instant>() {
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

    //    public With<Reason, Doctor, Instant> register(Patient patient) {
    //
    //        return reason -> (To<Doctor, Instant>) doctor -> (At<Instant>) date -> register(patient, reason, doctor, date);
    //    }

    public With<Reason, Doctor, Instant> register(Patient patient) {

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
