package com.github.stawirej.fluentapi.example.fluentapi.medicalcenter;

import com.github.stawirej.fluentapi.prepositions.simple.AtConsumer;
import com.github.stawirej.fluentapi.prepositions.simple.ToFunction;
import com.github.stawirej.fluentapi.prepositions.simple.WithFunction;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public final class MedicalCenter {

    private final Map<Id, Patient> patients = new HashMap<>();

    public WithFunction<ToFunction<AtConsumer<Instant>, Doctor>, Reason> register(Patient patient) {

        return new WithFunction<ToFunction<AtConsumer<Instant>, Doctor>, Reason>() {
            @Override
            public ToFunction<AtConsumer<Instant>, Doctor> with(Reason reason) {

                return new ToFunction<AtConsumer<Instant>, Doctor>() {
                    @Override
                    public AtConsumer<Instant> to(Doctor doctor) {

                        return new AtConsumer<Instant>() {
                            @Override
                            public void at(Instant date) {

                                register(patient, reason, doctor, date);
                            }
                        };
                    }
                };
            }
        };
    }

    //    public WithFunction<ToFunction<AtConsumer<Instant>, Doctor>, Reason> register(Patient patient) {
    //
    //        return reason -> doctor -> date -> register(patient, reason, doctor, date);
    //    }

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
