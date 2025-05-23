package CVDS.parcialFinal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
@Document(collection = "appointments")
public class Appointment {
    @Id
    private int appointmentId;
    private String name;
    private String numberId;
    private String eMail;
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

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }
}
