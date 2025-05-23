package CVDS.parcialFinal.service;

import CVDS.parcialFinal.DTO.AppointmentDTO;
import CVDS.parcialFinal.model.Appointment;
import CVDS.parcialFinal.model.Specialty;
import CVDS.parcialFinal.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService implements AppointmentServiceInterface{
    @Autowired
    private AppointmentRepository repository;

    public void addAppointment(AppointmentDTO appointmentDTO){
        Appointment appointment = new Appointment();
        appointment.setDateAppointment(appointmentDTO.getDateAppointment());
        appointment.setDoctor(appointmentDTO.getDoctor());
        appointment.setSpecialty(Specialty.valueOf(appointmentDTO.getSpecialty()));
        appointment.setUbication(appointmentDTO.getUbication());

        repository.save(appointment);
    }
}
