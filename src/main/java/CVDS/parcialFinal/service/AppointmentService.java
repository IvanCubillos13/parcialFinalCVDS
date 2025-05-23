package CVDS.parcialFinal.service;

import CVDS.parcialFinal.DTO.AppointmentDTO;
import CVDS.parcialFinal.model.Appointment;
import CVDS.parcialFinal.model.Specialty;
import CVDS.parcialFinal.repository.MongoAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService implements AppointmentServiceInterface{
    @Autowired
    MongoAppointmentRepository mongoAppointmentRepository;

    public Appointment addAppointment(AppointmentDTO appointmentDTO){
        Appointment appointment = new Appointment();
        appointment.setAppointmentId(appointmentDTO.getAppointmentId());
        appointment.setDateAppointment(appointmentDTO.getDateAppointment());
        appointment.setDoctor(appointmentDTO.getDoctor());
        appointment.setSpecialty(Specialty.valueOf(appointmentDTO.getSpecialty()));
        appointment.setUbication(appointmentDTO.getUbication());
        appointment.setName(appointmentDTO.getName());
        appointment.setNumberId(appointmentDTO.getNumberId());
        appointment.seteMail(appointmentDTO.geteMail());
        mongoAppointmentRepository.save(appointment);

        return appointment;
    }

}
