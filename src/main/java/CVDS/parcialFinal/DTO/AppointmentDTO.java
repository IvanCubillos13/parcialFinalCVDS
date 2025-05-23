package CVDS.parcialFinal.DTO;

import java.time.LocalDate;

public class AppointmentDTO {
    private int appointmentId;
    private String name;
    private String numberId;
    private String eMail;
    private LocalDate dateAppointment;
    private String specialty;
    private String doctor;
    private String ubication;

    //Getters and setters
    public LocalDate getDateAppointment() {return dateAppointment;}
    public String getName(){return name;}

    public String getNumberId() {return numberId;}

    public String getDoctor() {
        return doctor;
    }

    public String geteMail() {
        return eMail;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getUbication() {
        return ubication;
    }

    public int getAppointmentId() {return appointmentId;}

}
