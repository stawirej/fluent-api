package com.github.stawirej.fluentapi.example.scenarios.explicit.medicalcenter;

import com.github.stawirej.fluentapi.example.explicit.medicalcenter.Doctor;
import com.github.stawirej.fluentapi.example.explicit.medicalcenter.Id;
import com.github.stawirej.fluentapi.example.explicit.medicalcenter.MedicalCenter;
import com.github.stawirej.fluentapi.example.explicit.medicalcenter.Patient;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.ZonedDateTime;

import static com.github.stawirej.fluentapi.example.explicit.medicalcenter.Reason.HEADACHE;
import static org.assertj.core.api.BDDAssertions.then;

final class MedicalCenterScenarios {

    @Test
    void registerPatient() {
        // Given
        MedicalCenter medicalCenter = new MedicalCenter();
        Patient patient = new Patient(Id.of(1));
        Doctor doctor = new Doctor();
        Instant date = ZonedDateTime.now().plusDays(3).toInstant();

        // When
        //  medicalCenter.register(patient, headache, doctor, date, reason);
        medicalCenter.register(patient).with(HEADACHE).to(doctor).at(date);

        // Then
        Patient registeredPatient = medicalCenter.getPatientBy(Id.of(1));
        then(registeredPatient.reason()).isEqualTo(HEADACHE);
        then(registeredPatient.visitDate()).isEqualTo(date);
        then(registeredPatient.doctor()).isEqualTo(doctor);
    }
}
