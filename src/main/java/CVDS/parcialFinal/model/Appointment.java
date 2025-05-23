package CVDS.parcialFinal.model;

import java.time.LocalDate;

public class Appointment {
    private LocalDate dateAppointment;
    private Specialty specialty;
    private String doctor;
    private String ubication;

    //Setters
    public void setDateAppointment(LocalDate dateAppointment) {this.dateAppointment =dateAppointment;}

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }
}
